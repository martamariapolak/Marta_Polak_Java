package com.company.interfaces;

public class ConverterSwitch implements Converter {
    public String convertMonth(int monthNumber){
        String returnVal = "no month";
        switch(monthNumber) {

            case 1:

                return "January";
            case 2:

                return "February";
            case 3:

                return "March";
            case 4:

                return "April";
            case 5:

                return "May";
            case 6:

                return "June";
            case 7:

                return "July";
            case 8:

                return "August";
            case 9:

                return "September";
            case 10:

                return "October";
            case 11:

                return "November";
            case 12:

                return "December";
        }
                return returnVal;
        }
 //return returnVal;

   public String convertDay(int dayNumber) {
       String returnVal = "no day";
       switch (dayNumber) {
           case 1:

               returnVal= "Sunday";
               break;
           case 2:

               returnVal= "Monday";
               break;
           case 3:

               returnVal= "Tuesday";
               break;
           case 4:

               returnVal= "Wednasday";
               break;
           case 5:

               returnVal= "Thursday";
               break;
           case 6:

               returnVal= "Friday";
               break;
           case 7:

               returnVal= "Saturday";
               break;

       }

              return returnVal;




   } }
