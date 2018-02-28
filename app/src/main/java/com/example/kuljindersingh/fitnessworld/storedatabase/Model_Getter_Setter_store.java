package com.example.kuljindersingh.fitnessworld.storedatabase;

public class Model_Getter_Setter_store {

    String price;
    String image;
    String type;
    String name;
    String weight;
    String detail;
    String link;


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    Model_Getter_Setter_store(String name, String type, String price, String weight, String detail, String link, String image){

        this.name = name;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.image = image;
        this.detail=detail;
        this.link=link;

    }
    }
