package com.muedsa.taffy.utils;

import java.util.HexFormat;

public class HexFormatUtils {

    private static final HexFormat LOWER_CASE_FORMAT = HexFormat.of().withLowerCase();
    private static final HexFormat UPPER_CASE_FORMAT = HexFormat.of().withUpperCase();

    private static final String SYSTEM_LINE_SEPARATOR = System.lineSeparator();

    public static String beautify(byte[] bytes) {
        return beautify(bytes, false, true);
    }

    public static String beautify(byte[] bytes, boolean upperCase, boolean label) {
        HexFormat format;
        if(upperCase) {
            format = UPPER_CASE_FORMAT;
        }else{
            format = LOWER_CASE_FORMAT;
        }
        StringBuilder builder = new StringBuilder();
        int maxLine = (int) Math.ceil(bytes.length / 16d);
        int maxLabelDigitNumber = Math.max(8, (int) Math.ceil(Math.log(maxLine) / Math.log(16)));
        int endIndex = bytes.length - 1;
        for (int line = 0; line < maxLine; line++) {
            int index = line * 16;
            if(label){
                builder.append(fullPrefix(format.toHexDigits(index), maxLabelDigitNumber, "0"))
                        .append(": ");
            }
            int lineEndIndex = Math.min(index + 15, endIndex);
            while(index < lineEndIndex){
                int nextIndex = Math.min(index + 2, lineEndIndex + 1);
                builder.append(format.formatHex(bytes, index, nextIndex));
                if(nextIndex - 1 == lineEndIndex){
                    if(nextIndex - 1 != endIndex){
                        builder.append(SYSTEM_LINE_SEPARATOR);
                    }
                }else{
                    builder.append(" ");
                }
                index += 2;
            }
        }
        return builder.toString();
    }

    public static String toHex(byte[] bytes){
        return toLowerCaseHex(bytes);
    }

    public static String toHex(byte[] bytes, boolean upperCase){
        if(upperCase) {
            return toUpperCaseHex(bytes);
        } else {
            return toLowerCaseHex(bytes);
        }
    }

    public static String  toLowerCaseHex(byte[] bytes){
        return LOWER_CASE_FORMAT.formatHex(bytes);
    }

    public static String  toUpperCaseHex(byte[] bytes){
        return UPPER_CASE_FORMAT.formatHex(bytes);
    }

    private static String fullPrefix(String content, int max, String prefix){
        if(content.length() < max){
            StringBuilder prefixBuilder = new StringBuilder();
            for (int i = 0; i < max - content.length(); i++) {
                prefixBuilder.append(prefix);
            }
            content = prefixBuilder + content;
        }
        return content;
    }

    public static byte[] parseLowerCaseHex(String hex){
        return LOWER_CASE_FORMAT.parseHex(hex);
    }

    public static byte[] parseUpperCaseHex(String hex){
        return UPPER_CASE_FORMAT.parseHex(hex);
    }
}
