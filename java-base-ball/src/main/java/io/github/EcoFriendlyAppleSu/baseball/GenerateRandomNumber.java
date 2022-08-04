package io.github.EcoFriendlyAppleSu.baseball;

import java.util.Random;

/*
* computer에게 들어갈 3개의 랜덤 숫자를 받는 클래스
* */
public class GenerateRandomNumber {

    public int[] generateRandomNumber() {
        int[] ary = new Random().ints(3, 1, 9).toArray();
        return ary;
    }
}
