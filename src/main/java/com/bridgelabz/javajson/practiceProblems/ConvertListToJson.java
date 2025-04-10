package com.bridgelabz.javajson.practiceProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class CarDetails{
    private String model;
    private String color;
    private int price;

    // Constructor
    public CarDetails(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Getters and setters
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}

public class ConvertListToJson {
    public static void main(String[] args) throws JsonProcessingException {
        List<CarDetails>cars=new ArrayList<>();
        cars.add(new CarDetails("BMW", "Black", 50000));
        cars.add(new CarDetails("Audi", "White", 55000));

        ObjectMapper mapper=new ObjectMapper();
        String jsonArray=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cars);
        System.out.println(jsonArray);
    }
}
