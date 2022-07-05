package com.company;



public class Farmer extends man {


    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
    }
    private  boolean plowing;
    private boolean harvasting;



    public boolean isPlowing() {
        return plowing;
    }
    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvasting() {
        return harvasting;
    }

    public void setHarvasting(boolean harvasting) {
        this.harvasting = harvasting;
    }

}