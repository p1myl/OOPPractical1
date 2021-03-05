package com.prac1;

public class Main {

    public static void main(String[] args) {
    }

    public static int convert(int minutes) {
        return minutes * 60;
    }

    public static int points(int p2, int p3){
        return p2 * 2 + p3 * 3;
    }

    public static int footballPoints(int w, int d, int l){
        return w * 3 + d;
    }

    public static boolean divisibleByFive(int num){
        return num % 5 == 0;
    }

    public static boolean and(boolean c1, boolean c2){
        return c1 && c2;
    }

    public static int howManyWalls(int n, int w, int h){
        return n / (w * h);
    }

    public static int squared(int a) {
        return a * a;
    }

    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob * prize) > pay;
    }

    public static int frames(int minutes, int fps){
        return minutes * 60 * fps;
    }

    public static int mod(int n1, int n2){
        return Math.abs(n1 - ((n1 / n2) * n2));
    }
}
