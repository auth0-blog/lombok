package com.auth0.lomboktest;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Setter @Getter
    private String username;

    @Setter @Getter
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}