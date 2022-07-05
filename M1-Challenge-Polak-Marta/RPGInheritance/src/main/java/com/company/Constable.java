package com.company;

public class Constable extends man {

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
    }
    private  boolean jurisdiction;

    public boolean isJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(boolean jurisdiction) {
        this.jurisdiction = jurisdiction;
    }
    public String arrest(man man){
        System.out.println("you are arrested"+ man.getName());
        return man.getName();
    }
}