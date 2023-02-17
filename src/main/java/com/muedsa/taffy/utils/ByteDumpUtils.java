package com.muedsa.taffy.utils;

public class ByteDumpUtils {

    public static String format(byte[] bytes) {
        StringBuilder format = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int lineMod = i % 16;
            if(lineMod == 0){
                format.append(fullPrefix(Integer.toHexString(i),8));
                format.append(": ");
            }
            format.append(fullPrefix(Integer.toHexString(bytes[i] & 0xFF), 2));
            int mod = i % 2;
            if(mod == 1){
                format.append(" ");
            }
            if(lineMod == 15){
                format.append("\n");
            }
        }
        return format.toString();
    }

    public static String toHex(byte[] bytes){
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            hex.append(fullPrefix(Integer.toHexString(bytes[i] & 0xFF), 2));
        }
        return hex.toString();
    }

    private static String fullPrefix(String content, int max){
        if(content.length() < max){
            StringBuilder prefixBuilder = new StringBuilder();
            for (int i = 0; i < max - content.length(); i++) {
                prefixBuilder.append("0");
            }
            content = prefixBuilder + content;
        }
        return content;
    }
}
