package com.example.letsreise;

public class Contact {

    private String Name;
    private String Phone;

    public Contact() {
    }

    public Contact(String name, String phone) {
        Name = name;
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
