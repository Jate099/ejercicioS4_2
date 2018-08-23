package com.example.estudiante.ejercicios4_2;

//Se crea una clase modelo para controlr los datos

public class UserModel {
    private String name;
    private String email;
    private String userName;

    public UserModel(String name, String email, String userName) {
        this.name = name;
        this.email = email;
        this.userName = userName;
    }

    public String getName() { 
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
