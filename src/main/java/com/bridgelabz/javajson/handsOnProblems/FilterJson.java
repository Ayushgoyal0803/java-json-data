package com.bridgelabz.javajson.handsOnProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJson {
    public static void main(String[] args) {
        String jsonArray = """
        [
            {"name": "Alice", "age": 22, "email": "alice@example.com"},
            {"name": "Bob", "age": 28, "email": "bob@example.com"},
            {"name": "Charlie", "age": 30, "email": "charlie@example.com"}
        ]
        """;

        JSONArray jsonArr = new JSONArray(jsonArray);
        System.out.println("Users older than 25:");
        for (int i = 0; i < jsonArr.length(); i++) {
            JSONObject obj = jsonArr.getJSONObject(i);
            if (obj.getInt("age") > 25) {
                System.out.println(obj);
            }
        }
    }
}
