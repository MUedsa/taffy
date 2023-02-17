package com.muedsa.taffy.http;

import com.fasterxml.jackson.core.type.TypeReference;
import com.muedsa.taffy.utils.HttpClientUtils;
import com.muedsa.taffy.utils.JsonUtils;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class JsonResponseHandler<T> implements HttpClientResponseHandler<T> {

    private static final Map<Type, JsonResponseHandler<?>> cache = new ConcurrentHashMap<>();

    @SuppressWarnings("unchecked")
    public static <T> JsonResponseHandler<T> cache() {
        TypeReference<T> typeReference = new TypeReference<>() {};
        Type type = typeReference.getType();
        JsonResponseHandler<?> handler = cache.get(type);
        if (Objects.nonNull(handler)) {
            return (JsonResponseHandler<T>) handler;
        } else {
            JsonResponseHandler<T> newHandler = new JsonResponseHandler<T>(typeReference);
            cache.put(type, newHandler);
            return newHandler;
        }
    }

    private final TypeReference<T> typeReference;

    public JsonResponseHandler(TypeReference<T> typeReference) {
        this.typeReference = typeReference;
    }

    @Override
    public T handleResponse(ClassicHttpResponse response) throws HttpException, IOException {
        T obj = null;
        try {
            HttpEntity entity = response.getEntity();
            if (Objects.nonNull(response.getEntity())) {
                String jsonStr = EntityUtils.toString(entity, StandardCharsets.UTF_8);
                obj = JsonUtils.toJavaBean(jsonStr, typeReference);
            }
        } finally {
            try {
                response.close();
            } catch (Exception ignored) {
            }
        }
        return obj;
    }
}
