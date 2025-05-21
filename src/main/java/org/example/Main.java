package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock > 23 || clock < 0) {
            return false;
        }
        if (isBarking && (clock < 8 || clock > 20)) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if ((firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19)) {
            return true;
        }

        return false;

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        int limit = isSummer ? 45 : 35;

        if(temp >= 25 && temp <= limit){
            return true;
        }
        return false;
    }

    public static double area(double width, double height) {

        if(width < 0 || height < 0) {
            return -1;
        }

        return width*height;
    }

    public static double area(double radius) {

        if(radius < 0){
            return -1;
        }

        return Math.pow(radius, 2) * Math.PI;
    }
}