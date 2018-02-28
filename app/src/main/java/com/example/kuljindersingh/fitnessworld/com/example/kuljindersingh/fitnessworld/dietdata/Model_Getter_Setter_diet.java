package com.example.kuljindersingh.fitnessworld.com.example.kuljindersingh.fitnessworld.dietdata;

public class Model_Getter_Setter_diet {



    String type;
    String name;

    String detail;


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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    Model_Getter_Setter_diet(String name, String type,  String detail){

        this.name = name;

        this.type = type;

        this.detail=detail;


    }
    }
