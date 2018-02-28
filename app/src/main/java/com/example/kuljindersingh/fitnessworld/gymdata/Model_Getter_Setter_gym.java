package com.example.kuljindersingh.fitnessworld.gymdata;

public class Model_Getter_Setter_gym {


    String image;
    String type;
    String name;

    public Model_Getter_Setter_gym() {

    }


    public String getHowto() {
        return howto;
    }

    public void setHowto(String howto) {
        this.howto = howto;
    }

    String howto;




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






    Model_Getter_Setter_gym(String name, String type, String image,String howto ){

        this.name = name;

        this.type = type;
        this.image = image;
        this.howto=howto;


    }
    }
