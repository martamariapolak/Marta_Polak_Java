package com.company.interfaces;



public class ConverterApplication {
    public static void main(String[] args) {
        Converter Converter1= new ConverterIf();
        Converter Converter2= new ConverterSwitch();

        System.out.println("Month is "+ Converter1.convertMonth(4));
        System.out.println("Day is "+ Converter1.convertDay(3));
        System.out.println("Month is "+ Converter2.convertMonth(4));
        System.out.println("Day is "+ Converter2.convertDay(3));

    }
}
