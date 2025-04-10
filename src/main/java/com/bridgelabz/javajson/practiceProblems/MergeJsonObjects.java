package com.bridgelabz.javajson.practiceProblems;

import org.json.JSONObject;

public class MergeJsonObjects {
    public static void main(String[] args) {
        JSONObject json1=new JSONObject();
        json1.put("name","vashu");
        json1.put("age",16);
        JSONObject json2=new JSONObject();
        json2.put("email","vashu@gmail.com");
        json2.put("city","rajpura");

        for(String key: json2.keySet()){ //iterates over all keys in json2
            json1.put(key,json2.get(key));
        }

        System.out.println("merged json: "+json1.toString(4));
    }
}
