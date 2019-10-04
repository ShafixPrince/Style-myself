package com.example.user.stylemyself;

public class Headwear {

    int id;
    String name;
    String color;
    String type;



    public Headwear(int id, String name, String color, String type) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.type = type;
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

    public String getColor() {
        return color;
    }

    public void setColor(String address) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
