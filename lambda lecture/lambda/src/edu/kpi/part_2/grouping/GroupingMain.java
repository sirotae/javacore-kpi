package edu.kpi.part_2.grouping;

import edu.kpi.utils.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * Created by olenasyrota on 11/29/15.
 */
public class GroupingMain {

    public static List<Person> createPeople() {
        List res = new ArrayList();
        res.add(new Person("Ann", 25));
        res.add(new Person("Mary", 25));
        res.add(new Person("Ann", 24));
        res.add(new Person("Mary", 24));
        res.add(new Person("John", 23));
        return res;
    }

    public static void main(String[] args) {
        List<Person> list = createPeople();
        Map<String, List<Integer>> res = list
                .stream()
                .collect(
                        groupingBy(Person::getName, mapping(Person::getAge, toList())));

        System.out.println(res);
    }
}
