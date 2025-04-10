package com.bridgelabz.javajson.handsOnProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    public String name;
    public int age;
    public String email;

    public User() {}
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class JavaObjectsToJsonArray {
    public static void main(String[] args) throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 22, "alice@example.com"));
        users.add(new User("Bob", 28, "bob@example.com"));

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);
        System.out.println(jsonArray);
    }
}
