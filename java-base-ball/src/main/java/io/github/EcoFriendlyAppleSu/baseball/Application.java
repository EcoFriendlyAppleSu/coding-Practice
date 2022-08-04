package io.github.EcoFriendlyAppleSu.baseball;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        GenerateRandomNumber comNumber = new GenerateRandomNumber();
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
