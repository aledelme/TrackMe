package com.example.ikerlopez.trackme;

public class User {
    private String email;
    private String token;

    public User (String email, String token){
        this.email = email;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }
}
