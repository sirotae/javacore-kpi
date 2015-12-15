package edu.kpi.part_1.composition;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by olenasyrota on 11/28/15.
 */
public class MainPredicates {


    public static void main(String[] args) {

        Predicate<String> pr1 = f -> f==null;
        Predicate<String> pr2 = f -> f.isEmpty();


        List<String> list1 = new ArrayList<String>();
        // ... add elements to list
        List<String> listRes = list1.stream()
                .filter(pr1
                        .or(pr2)
                        .negate())
                .collect(Collectors.toList());



    }
}
