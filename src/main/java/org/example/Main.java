package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(clock < 0 || clock >23 || !isBarking){
            return false;
        }
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int limit = isSummer ? 45 : 35;
        return temp >= 25 && temp <= limit;

    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0){
            System.out.println("Width or height cannot be less than zero!");
            return -1;
        }

        return width * height;
    }

    public static double area(double radius) {
        if ( radius < 0){
            System.out.println("Radius cannot be less than zero!");
            return -1;
        }

        return Math.pow(radius,2) * Math.PI;
}
}
