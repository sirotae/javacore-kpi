package edu.kpi.part_2.infinite;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by olenasyrota on 11/29/15.
 */
public class InfiniteMain {

    public static boolean isPrime(int n) {
        return ((n>1) &&
        IntStream.range(2,n)
                .noneMatch(i -> n%i==0));
    }

    // total of sqrt of first k prime numbers starting from n
    public static double compute(int k, int n) {
        return Stream.iterate(n, e-> e+1)
                .filter(InfiniteMain::isPrime)
                .mapToDouble(Math::sqrt)
                .limit(k)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println(compute(15, 1));
    }
}
