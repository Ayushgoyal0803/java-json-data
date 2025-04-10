package com.bridgelabz.javajson.handsOnProblems;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXML {
    public static void main(String[] args) {
        JSONObject json = new JSONObject();
        json.put("name", "Alice");
        json.put("age", 25);
        json.put("email", "alice@example.com");

        String xml = XML.toString(json);
        System.out.println("XML format:\n" + xml);
    }
}
