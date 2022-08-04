package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.util.StringToNumberList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Role : 사용자의 입력 역할
 * Responsibility : 입력을 받아 넘겨줄 책임이 존재한다.
 * Collaboration : Scanner, StringToNumberList Util과 협력
 */
public class UserInput {

    static Scanner scanner = new Scanner(System.in);

    public static List<Integer> input() {
        System.out.println("세 자리 숫자를 입력해주세요!");
        return StringToNumberList.stringArrayToIntegerListUsingStream(scanner.nextLine());
    }

    public static Integer againAskInputNumber() {
        return Integer.valueOf(scanner.nextLine());
    }
}
