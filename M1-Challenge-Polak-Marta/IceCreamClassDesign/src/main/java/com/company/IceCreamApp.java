package com.company;

public class IceCreamApp {
    public static void main(String[] args) {


        com.company.factory.Icecream IceCreamF= new com.company.factory.Icecream(5,2.50,100.20 );
        com.company.pointofSale.Icecream iceCreamS = new com.company.pointofSale.Icecream("vanilia",5,25.50);
        double dayProduction=IceCreamF.dayProduction();
        System.out.println("machines product daily"+ dayProduction+ "kg icecream");
        double daymoney=IceCreamF.dayMoney();
        System.out.println("owner get"+ daymoney+"$ from the shop daily");
        double makemoney=IceCreamF.dailyIncome();
        System.out.println("owner makes"+makemoney+"$ every day");
        double shoporder=iceCreamS.order();
        iceCreamS.promotion();
        iceCreamS.setPrice();
    }

}
