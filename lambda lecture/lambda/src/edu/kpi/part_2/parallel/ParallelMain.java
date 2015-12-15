package edu.kpi.part_2.parallel;

import edu.kpi.utils.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by olenasyrota on 11/29/15.
 */
public class ParallelMain {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);


        ForkJoinPool pool = new ForkJoinPool(50);


        pool.submit(() ->
                numbers.parallelStream()
                        .filter(Utils::isEven)
                        .map(Utils::doubleIt)
                        .forEach(System.out::println));

        pool.shutdown();
        Thread.sleep(5000);
    }
}
