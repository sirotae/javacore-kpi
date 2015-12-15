package edu.kpi.part_2.terminal;

import edu.kpi.utils.Utils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by olenasyrota on 11/29/15.
 */
public class TerminalMain {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        System.out.println(
                list.stream()
                .filter(Utils::isEven)
                .filter(Utils::isGT3)
                //.findFirst()
        );

        System.out.println("done");

    }
}
