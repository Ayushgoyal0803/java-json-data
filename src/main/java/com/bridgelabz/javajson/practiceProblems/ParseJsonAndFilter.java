package com.bridgelabz.javajson.practiceProblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonAndFilter {
    public static void main(String[] args) {
        String jsonData="[{\"name\":\"manvi\",\"age\":22},{\"name\":\"vashu\",\"age\":28},{\"name\":\"Charlie\",\"age\":30}]";

        JSONArray jsonArray=new JSONArray(jsonData);
        for(int i=0;i<jsonArray.length();i++){
            JSONObject person=jsonArray.getJSONObject(i);
            int age=person.getInt("age");
            if(age>25){
                System.out.println(person.toString());    }
        }
    }
}
