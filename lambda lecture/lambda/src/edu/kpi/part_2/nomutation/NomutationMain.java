package edu.kpi.part_2.nomutation;

import edu.kpi.utils.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by olenasyrota on 11/29/15.
 */


public class NomutationMain {

    public static List<Person> createPeople() {
        return null;
    }

    public static void main(String[] args) {
        List<Person> list = createPeople();

        // do not do this way

        List res = new ArrayList<>();
        list.stream()
                .filter(p->p.getAge()<25)
                .forEach(p->res.add(p));


        // variant 2
        //partial mutability - you can do this
        List<Person> resWithReduce = list.stream()
                .filter(p->p.getAge()<25)
                .reduce(
                        new ArrayList<Person>(),
                        (l, p) -> {l.add(p); return l;},
                        (l1, l2) -> {l1.addAll(l2); return l1;}
                );


        // variant 3
        List<Person> resWithCollect = list.stream()
                .filter(p->p.getAge()<25)
                .collect(Collectors.toList());
    }
}
