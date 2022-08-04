package io.github.EcoFriendlyAppleSu.baseball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        GenerateThreeRandomNumber comNumber = new GenerateThreeRandomNumber();
        int[] ints = comNumber.generateRandomNumber();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int number :
                ints) {
            integers.add(number);
        }
        Arrays.stream(ints).forEach(System.out::println);
        System.out.println("integers = " + integers);
        System.out.println(ints.length);

    }
}
