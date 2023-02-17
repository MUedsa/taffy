package com.muedsa.taffy.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class SignUtils {

    public static  <T> String sign(T data, byte[] key){
        ObjectNode objectNode = JsonUtils.objectMapper.valueToTree(data);
        Iterator<Map.Entry<String, JsonNode>> fields = objectNode.fields();
        List<String> params = new ArrayList<>();
        while (fields.hasNext()){
            Map.Entry<String, JsonNode> entry = fields.next();
            params.add(entry.getKey() + "=" + entry.getValue().asText());
        }
        params.sort(String::compareTo);
        String unsignedString = String.join("&", params);
        HmacUtils hm1 = new HmacUtils(HmacAlgorithms.HMAC_SHA_256, key);
        return hm1.hmacHex(unsignedString.getBytes(StandardCharsets.UTF_8));
    }

}
