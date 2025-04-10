package com.bridgelabz.javajson.practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class User{
    private String name;
    private String email;
    private int age;

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getEmail(){return email;}
    public void setEmail(String email){this.email=email;}
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}
}
public class ValidateJson {
    public static void main(String[] args) {
        ObjectMapper mapper=new ObjectMapper();
        try{
            User user=mapper.readValue(new File("D:\\bridgelabz-workspace\\java-json-data\\src\\main\\java\\com\\bridgelabz\\javajson\\practiceProblems\\userDetails.json"),User.class);
            System.out.println("json is valid");
            System.out.println(user.getName());
            System.out.println(user.getEmail());
            System.out.println(user.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
