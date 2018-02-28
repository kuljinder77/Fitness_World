package com.example.kuljindersingh.fitnessworld.profile1;

public class Model_Getter_Setter_profile {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String name;
    String age;
    String sex;
    String bmi;
    String phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    String username;



    Model_Getter_Setter_profile(String name,String age,String sex,String bmi,String phone,String username){

        this.name = name;
        this.sex = sex;
        this.age = age;
        this.bmi = bmi;
        this.phone = phone;
        this.username=username;

    }
    }
