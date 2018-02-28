package com.example.kuljindersingh.fitnessworld.yogadata;

public class Model_Getter_Setter_yoga {

    String description;
    String image;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String item;
    String name;




    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    Model_Getter_Setter_yoga(String name, String description, String image, String item){

        this.name = name;

        this.item = item;
        this.image = image;
        this.description=description;


    }
    }
