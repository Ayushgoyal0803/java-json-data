package com.bridgelabz.javajson.practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJson {
    public static void main(String[] args) {
        JSONObject jsObject = new JSONObject();
        JSONArray subject = new JSONArray();
        subject.put("DSA");
        subject.put("Java");
        subject.put("OOPs");
        subject.put("Web");

        jsObject.put("name","Ayush");
        jsObject.put("age",21);
        jsObject.put("Subject",subject);

        System.out.println(jsObject);
    }

}
