package edu.kpi.utils;

/**
 * Created by olenasyrota on 11/1/15.
 */
public class Utils {

    public static boolean isEven(int n) {
        System.out.println("isEven " + n);
        return ((n % 2) == 0);
    }

    public static boolean isGT3(int n) {
        System.out.println("isGT3 "+n);
        return n>3;
    }


    public static int doubleIt(int n) {
        return n*2;
    }
}
