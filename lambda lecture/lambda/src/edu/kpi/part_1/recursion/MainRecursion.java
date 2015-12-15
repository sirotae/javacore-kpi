package edu.kpi.part_1.recursion;

import java.util.function.UnaryOperator;

/**
 * Created by olenasyrota on 11/28/15.
 */
public class MainRecursion {

    static UnaryOperator<Integer> factorial;

    public static long calcFactorialWithLambda(int n) {

        factorial = i ->  i == 0 ? 1 : i * factorial.apply(i - 1);

        return factorial.apply(n);
    }

    public static void main(String[] args) {
        System.out.println(calcFactorialWithLambda(5));

    }
}
