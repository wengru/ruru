package com.company.project.web;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map map = new HashMap();
        map.put(1,1);
        map.put(2,2);
        //try {
            String t = objectMapper.writeValueAsString(map);
            System.out.println(t);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
    }
}
