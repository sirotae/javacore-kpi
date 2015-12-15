package edu.kpi.part_1.lab1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by olenasyrota on 11/28/15.
 */

class Pair{
    String key;
    Integer value;

    public Pair (String key, Integer value) {
        this.key = key;
        this.value = value;
    }

}

public class Lab1Example {

    public static int getNumberOfDiffSymbols(String str) {
        Map<Character, Integer> symbols = new HashMap<>();
        for (int i=0;i<str.length();i++) {
            Character ch = str.charAt(i);
            symbols.put(ch, 0);
        }
        return symbols.keySet().size();
    }

    public static Pair getLeastSymbols(Pair a1, Pair a2) {
        if (a1==null) return a2;
        if (a2 == null) return a1;
        return (a1.value<=a2.value)? a1:a2;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("qwerty", "asdfg", "qwqwqw", "asasas", "aaaaaaa");


        Pair res = list.stream()
                .map(e -> new Pair(e, Lab1Example.getNumberOfDiffSymbols(e)))
                .reduce(null, Lab1Example::getLeastSymbols);
        System.out.println(res.key);
    }
}
