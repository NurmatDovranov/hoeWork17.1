package com.company;

public class Main {

    public static void main(String[] args) {

        Sheep sheep1 = new Sheep(10,2,"Female","sheep1");
        Sheep sheep2 = new Sheep(15,4,"Male","sheep2");
        Sheep sheep3 = new Sheep(20,6,"Female","sheep3");
        Sheep sheep4 = new Sheep(25,8,"Male","sheep4");

        Cow cow1 = new Cow(150,1,"Female","cow1");
        Cow cow2 = new Cow(160,3,"Male","cow2");
        Cow cow3 = new Cow(170,5,"Female","cow3");
        Cow cow4 = new Cow(180,7,"Male","cow4");
        Cow cow5 = new Cow(190,9,"Male","cow5");
        Cow cow6 = new Cow(200,11,"Female","cow6");

        Horse horse1 = new Horse(200,4,"Male","horse1","Black");
        Horse horse2 = new Horse(240,8,"Female","horse2","Grey");
        Horse horse3 = new Horse(280,12,"Female","horse3","Yellow");

        AbstractFarm[] Ferma1 = {sheep1,sheep2,sheep3,cow1,cow2,cow3,cow4,cow5,horse1,horse2};
        System.out.println("1-"+AbstractFarm.getOwnerName("Bakiev Kurmanbek."));
        System.out.println("1-"+AbstractFarm.getAddress("Minsk"));

        for (AbstractFarm i:Ferma1) {
           System.out.println((i));
        }
        System.out.println("\n");
        System.out.println("2-"+AbstractFarm.getOwnerName("Akaev Askar."));
        System.out.println("2-"+AbstractFarm.getAddress("Moscow"));
        AbstractFarm[] farm2 = {sheep4,cow6,horse3};
        for(AbstractFarm i:farm2) {
            System.out.println((i));
        }

    }
}