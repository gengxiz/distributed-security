package com.security.securityorder.util;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil {
    static ObjectMapper objectMapper = new ObjectMapper();

    public static <T>T parseObject(String string,Class<T> clazz){
        try {
            return objectMapper.readValue(string,clazz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String toJsonString(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
