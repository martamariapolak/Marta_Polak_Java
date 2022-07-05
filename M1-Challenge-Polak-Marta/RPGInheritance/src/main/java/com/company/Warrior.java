package com.company;

public class Warrior extends man {
    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
    }
     private int ShieldStength;

    public int getShieldStength() {
        return ShieldStength;
    }

    public void setShieldStength(int shieldStength) {
        ShieldStength = shieldStength;
    }



}
