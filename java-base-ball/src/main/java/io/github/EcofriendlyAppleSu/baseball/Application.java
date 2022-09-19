package io.github.EcofriendlyAppleSu.baseball;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3,2,1);
        for (Integer integer : integerList) {
            System.out.println("값 : " + integer + " 위치 : " + integerList.indexOf(integer));
        }
    }
}
