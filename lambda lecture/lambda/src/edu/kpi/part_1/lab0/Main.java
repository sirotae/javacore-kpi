package edu.kpi.part_1.lab0;

import edu.kpi.utils.Utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void internalIteration (List list) {
        for (Object o: list) {
            System.out.println(o);

        }
    }

    public static void externalIterationViaAnonymousFunction(List list) {
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
    }

    public static void externalIterationViaLambda(List list) {
        list.forEach(o->System.out.println(o));
        list.forEach(System.out::println);
    }

    public static int findFirstEvenAndGT3(List<Integer> list) {
        return list.stream()
                .filter(i -> i % 2 == 0)
                .filter(i -> i > 3)
                .findFirst()
                .get();
    }


    public static int findFirstEvenAndGT3Readable(List<Integer> list) {
        return list.stream()
                .filter(Utils::isEven)
                .filter(x->Utils.isGT3(x))
                .findFirst().get();
    }

    public static void main(String[] args) {
	    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        System.out.println(list.stream()
                .filter(Utils::isEven)
                .filter(Utils::isGT3)
                .findFirst().get());//forEach(System.out::println);

        //System.out.println(findFirstEvenAndGT3Readable(list));

/*
        list.stream()
                .filter(Utils::isEven)
                .filter(Utils::isGT3);
        System.out.println("done");
*/



    }
}
