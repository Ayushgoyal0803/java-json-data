package com.bridgelabz.javajson.practiceProblems;

import com.google.gson.Gson;
import org.json.JSONObject;

class Car{
    String type;
    String color;

    Car(String type, String color){
        this.type=type;
        this.color=color;
    }
}
public class JavaObjectToJsonFormat {
    public static void main(String[] args) {
        //MANUALLY CONVERTING
//        Car car=new Car("Venue","White");
//        JSONObject carJson=new JSONObject();
//        carJson.put("type",car.type);
//        carJson.put("color",car.color);
//
//        System.out.println(carJson.toString(4));

        //AUTOMATIC CONVERSION
        Car car=new Car("XUV","Grey");
        Gson carGson=new Gson();
        String json=carGson.toJson(car);

        System.out.println(json);
    }

}
