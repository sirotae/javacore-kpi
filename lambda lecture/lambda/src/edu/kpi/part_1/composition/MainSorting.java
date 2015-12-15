package edu.kpi.part_1.composition;

import edu.kpi.utils.Person;

import java.util.Comparator;
import java.util.List;

/**
 * Created by olenasyrota on 11/28/15.
 */



public class MainSorting {
    public static List<Person> createPeople() {
        return null;
    }

    public static void printSorted(List people, Comparator<Person> cmp) {
        people.stream()
                .sorted(cmp)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Person> people = createPeople();

        printSorted(people,
                Comparator.comparing(Person::getAge)
                          .thenComparing(Person::getName));
    }
}
