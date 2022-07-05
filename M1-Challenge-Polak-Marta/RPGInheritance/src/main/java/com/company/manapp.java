package com.company;

public class manapp {
    public static void main(String[] args) {
        Farmer John =new Farmer("John",75,100,100,50,10,false,false);
        Warrior Bruce= new Warrior("Bruce",75,100,100,50,10,false,false);
Constable Bob= new  Constable("Bob",60,100,60,20,5,false,false);
Bruce.setShieldStength(100);;
John.setHarvasting(false);
John.setPlowing(false);
Bruce.attack(John);
Bob.arrest(Bruce);


    }
}
