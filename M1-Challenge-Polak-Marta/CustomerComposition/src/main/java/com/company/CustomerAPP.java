package com.company;

public class CustomerAPP {
    public static void main(String[] args) {
       Address billingAddress= new Address("pennsylvania","str","NY","NY","11298");
       Address shippingAddress= new Address("Maim","street","Freeport","NY","11298");
       Customer marta=new Customer("marta","polak","marta@ogicom.pl",4444444,true, billingAddress,shippingAddress);
        System.out.println( marta);
    }
}
