package com.company;

public abstract class AbstractFarm {
    public int weight;
    public int age;
    public String gender;
    public String NickName;
    private static String ownerName;
    private static String address;


    static String getOwnerName(String ownerName) {return "Fermanyn eesi: " + ownerName;}
    static String getAddress(String address) {return "Fermanyn addresi: " + address;}



}