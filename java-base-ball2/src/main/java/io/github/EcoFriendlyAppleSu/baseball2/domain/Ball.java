package io.github.EcoFriendlyAppleSu.baseball2.domain;

/*
* Role : 공 한개의 결과를 판단하는 객체
* Responsibility : 공의 상태를 판단한다.
* Collaboration :
*/
public class Ball {
    private int location;
    private int ballNumber;

    public Ball(int location, int ballNumber) {
        this.location = location;

        this.ballNumber = ballNumber;
    }
}
