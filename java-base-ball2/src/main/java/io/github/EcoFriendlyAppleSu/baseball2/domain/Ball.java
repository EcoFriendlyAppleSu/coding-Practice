package io.github.EcoFriendlyAppleSu.baseball2.domain;

import io.github.EcoFriendlyAppleSu.baseball2.Wrapper.BallNumber;

/*
* Role : 공 한개의 결과를 판단하는 객체
* Responsibility : 공의 상태를 판단한다.
* Collaboration :
*/
public class Ball {
    private int location;
    private BallNumber ballNumber;

    public Ball(int location, int ballNumber) {
        this.location = location;
        this.ballNumber = new BallNumber(ballNumber);
    }

    public BallStatus matchTheBall(Ball user) {
        if (this.equals(user)) {
            return BallStatus.STRIKE;
        }
        if (this.ballNumber.equals(user.ballNumber)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        if (location != ball.location) return false;
        return ballNumber != null ? ballNumber.equals(ball.ballNumber) : ball.ballNumber == null;
    }

    @Override
    public int hashCode() {
        int result = location;
        result = 31 * result + (ballNumber != null ? ballNumber.hashCode() : 0);
        return result;
    }
}
