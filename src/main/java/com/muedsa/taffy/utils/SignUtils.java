package com.muedsa.taffy.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class SignUtils {

    public static <T> String toSignStr(T data, List<String> ignoreKeys) {
        ObjectNode objectNode = JsonUtils.objectMapper.valueToTree(data);
        Iterator<Map.Entry<String, JsonNode>> fields = objectNode.fields();
        List<String> params = new ArrayList<>();
        while (fields.hasNext()){
            Map.Entry<String, JsonNode> entry = fields.next();
            if(!ignoreKeys.contains(entry.getKey())){
                params.add(entry.getKey() + "=" + entry.getValue().asText());
            }
        }
        params.sort(String::compareTo);
        return String.join("&", params);
    }

    public static <T> String sign(String signStr, byte[] key){
        HmacUtils hm1 = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        return hm1.hmacHex(signStr.getBytes(StandardCharsets.UTF_8));
    }

    public static <T> String sign(T data, byte[] key, List<String> ignoreKeys){
        return sign(toSignStr(data, ignoreKeys), key);
    }

}
