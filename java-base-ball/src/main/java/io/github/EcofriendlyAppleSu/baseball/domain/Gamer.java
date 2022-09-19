package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.StringUtil;

import java.util.List;

public class Gamer implements Player {

    private Balls balls;

    // 다른 전략으로 데이터를 받아 올 수 있어서 생성자 주입을 통해 String 처리
    private StringUtil stringUtil;

    private Gamer(StringUtil stringUtil) {
        this.stringUtil = stringUtil;
    }

    public Gamer of(StringUtil stringUtil) {
        return new Gamer(stringUtil);
    }
}
