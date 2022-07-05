package com.company.pointofSale;

    public class Icecream {
        private String flavor;
        private int quantity;
        private double orderPrice;

        public Icecream(String flavor, int quantity, double orderPrice) {
            this.flavor = flavor;
            this.quantity = quantity;
            this.orderPrice = orderPrice;
        }

        public String getFlavor() {
            return flavor;
        }

        public void setFlavor(String flavor) {
            this.flavor = flavor;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getOrderPrice() {
            return orderPrice;
        }

        public void setOrderPrice() {
            this.orderPrice = orderPrice;
        }
        public int order(){
            if (orderPrice>=2.50){
                System.out.println("my order is 300 scubs");
                return 300;}
            else {
                System.out.println("my order is 500 scubs");
                return 500;
            }
        }
        public void promotion(){
            System.out.println("Buy"+ quantity+ "scups you get " + quantity+ flavor+" for free");
        }
        public double setPrice(){
            double selPrice= orderPrice*1.2;
            System.out.println("the price is " + selPrice+ "$ for kg");
            return selPrice;
        }


    }
