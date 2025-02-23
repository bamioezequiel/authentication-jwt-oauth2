package com.bamioezequiel.authentication_jwt_oauth2.model;

import java.util.HashMap;

public class Role {
    private int id;
    private String name;
    //ejemplo: ROLE_USER, ROLE_ADMIN
    private Set<User> users = new HashSet<>();

    public Role() {
    }

    public Role(int id, Set<User> users, String name) {
        this.id = id;
        this.users = users;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
