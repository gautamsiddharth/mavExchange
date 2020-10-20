package com.example.project;

public class UserHelperClass {
    String  name, username, email, password, confirm_password;
    public UserHelperClass() {

    }

    public UserHelperClass(String name, String username, String email, String password, String confirm_password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getConfirm_password() {
        return confirm_password;
    }

    public void setConfirm_password(String confirm_password) {
        this.confirm_password = confirm_password;
    }
}
