package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock > 23 || clock < 0 ) {
            return false;
        } else if ((clock < 8 || clock > 20) && isBarking){
            return true;
        }  else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if ((firstAge > 12 && firstAge <20) || (secondAge > 12 && secondAge <20) || (thirdAge > 1 && thirdAge <20)) {
            return true;
       }    else return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if (isSummer && (temp < 46 && temp > 24)) {
         return true;
     } else if (isSummer) {
         return false;
     }else if (temp > 24 && temp < 36) {
         return true;
     }else return false;
    }

    public static double area(double width, double height) {
        if (width > 0 && height > 0) {
            double result = width * height;
            return result;
        } else {
            return -1;
        }
    }

    public static double area(double radius) {
        if (radius > 0) {
            double result2 = radius*radius*Math.PI;
            return result2;
        } else {
            return -1;
        }
       
    }
}
