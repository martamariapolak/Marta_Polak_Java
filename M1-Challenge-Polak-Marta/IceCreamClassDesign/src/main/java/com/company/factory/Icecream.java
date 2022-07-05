package com.company.factory;

public class Icecream {
    private int machineCounter;
    private double oneKiloproductionCost;
    private double oneMachineMake;

    public Icecream(int machineCounter, double oneKiloproductionCost, double oneMachineMake) {
        this.machineCounter = machineCounter;
        this.oneKiloproductionCost = oneKiloproductionCost;
        this.oneMachineMake = oneMachineMake;
    }

    public int getMachineCounter() {
        return machineCounter;
    }

    public void setMachineCounter(int machineCounter) {
        this.machineCounter = machineCounter;
    }

    public double getOneKiloproductionCost() {
        return oneKiloproductionCost;
    }

    public void setOneKiloproductionCost(double oneKiloproductionCost) {
        this.oneKiloproductionCost = oneKiloproductionCost;
    }

    public double getOneMachineMake() {
        return oneMachineMake;
    }

    public void setOneMachineMake(double oneMachineMake) {
        this.oneMachineMake = oneMachineMake;
    }
    public double dayProduction(){
         double dayProduct = oneMachineMake *  machineCounter;
         return  dayProduct;}

     public double dayMoney()   {
         double dayProduct=dayProduction();
          double dayMon =dayProduct * oneKiloproductionCost* 1.4 ;
          return dayMon;
        }

    public double dailyIncome(){
        double dayMon=dayMoney();
        double dayProduct=dayProduction();
      double dailyInc = dayMon - (dayProduct * oneKiloproductionCost);
      return dailyInc;
    }
}
