package edu.kpi.part_2.example1;

import edu.kpi.utils.Utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by olenasyrota on 12/15/15.
 */
// найти сумму квадратов всех четных чисел
public class Main {

    public static void main (String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        list.stream()
                .filter(Utils::isEven)
                .mapToDouble(o->o*o)
                .sum();

    }
}
