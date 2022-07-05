package com.company;

public class CalculatorApp {
    public static void main(String[] args) {

     Calculator Calc = new Calculator();

        //int x=1;int y=1;
        Calc.add(1,1);

         //x=23;
        // y=52;
         Calc.subtract(23,52);

        //x=34;
       // y=2;
        Calc.multiply(34,2);

       // x=12;
       // y=3;
        Calc.divide(12,3);
        //x=12;
        //y=7;
       Calc.divide(12.0,7.0);


       // double m=3.4;
        //double p=2.3;
        Calc.add(3.4,2.3);

        // m=6.7;
        // p=4.4;
         Calc.multiply(6.7,4.4);
       // System.out.println(m + " * " + p+ " = " + k);
       // m=5.5;
       //  p=0.5;
         Calc.subtract(5.5,0.5);
         //m=10.8;
         //p=2.2;
         Calc.divide(10.8,2.2);



    }

}
