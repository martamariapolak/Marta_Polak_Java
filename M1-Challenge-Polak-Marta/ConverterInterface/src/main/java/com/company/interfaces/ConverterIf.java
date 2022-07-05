package com.company.interfaces;

public class ConverterIf implements Converter {
    public String convertMonth(int monthNumber) {
        if (monthNumber == 0 || monthNumber > 12) {
           // return "Invalid Month";
            throw new IllegalArgumentException("invalid number");
        } else if (monthNumber == 1) {
            return "January";
        }
        else if (monthNumber == 2) {
            return "February";
        }
       else  if (monthNumber == 3) {
            return "March";
        }
       else  if (monthNumber == 4) {
            return "April";
        }
        else if (monthNumber == 5) {
            return "May";
        }
       else if (monthNumber == 6) {
            return "June";
        }
       else if (monthNumber == 7) {
            return "July";
        }
        else if (monthNumber == 8) {
            return "August";
        }
        else if (monthNumber == 9) {
            return "September";
        }
        else if (monthNumber == 10) {
            return "October";
        }
        else if (monthNumber == 11) {
            return "November";
        }
        else   {
            return "December";
        }
    }

    public String convertDay(int dayNumber){
        if (dayNumber == 0 ||dayNumber > 7) {
            return "Invalid Day";
        } else if (dayNumber == 1) {
            return "Sunday";
        }
        if(dayNumber==2){
            return"Monday";
        }
        if(dayNumber==3){
            return"Tuesday";
        }
        if(dayNumber==4){
            return"Wendsday";
        }
        if(dayNumber==5){
            return"Thursday";
        }
        if(dayNumber==6){
            return"Friday";
        }
        if(dayNumber==7){
            return"Sutarday";
        }
        else{
            return"no day";
        }
    }
}