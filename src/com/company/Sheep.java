package com.company;

public class Sheep extends AbstractFarm {

    public Sheep(int weight, int age, String gender, String NickName) {
        this.weight  = weight;
        this.age = age;
        this.gender = gender;
        this.NickName = NickName;
    }
    @Override
    public String toString() {
        return "Nick Name: "+NickName+", Weight: "+weight+", Age: "+age+", Gender: "+gender;
    }
}