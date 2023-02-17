package com.muedsa.taffy.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.util.JsonFormat;


public class JsonUtils {

    public static final ObjectMapper objectMapper = new ObjectMapper()
            .setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL);

    public static final JsonFormat.Printer printer = JsonFormat.printer();

    public static String toJsonString(Object obj) {
        if (obj == null) {
            return null;
        } else {
            try {
                return obj.getClass() == String.class ? (String)obj : objectMapper.writeValueAsString(obj);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static <T> T toJavaBean(String json, TypeReference<T> type)  {
        try {
            return objectMapper.readValue(json, type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T readNodeValue(String json, String fieldName, TypeReference<T> type) {
        JsonNode jsonNode = null;
        try {
            jsonNode = objectMapper.readTree(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return toJavaBean(toJsonString(jsonNode.get(fieldName)), type);
    }

    public static String protobufToString(Message message) {
        try {
            return printer.print(message);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
