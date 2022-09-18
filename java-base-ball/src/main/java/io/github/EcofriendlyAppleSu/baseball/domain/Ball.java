package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.domain.wrapper.BallNumber;
import io.github.EcofriendlyAppleSu.baseball.domain.wrapper.Location;

public class Ball {

    private BallNumber ballNumber;
    private Location location;

    public Ball(int ballNumber, int location) {
        this.ballNumber = BallNumber.from(ballNumber);
        this.location = Location.from(location);
    }

    public static Ball of(int ballNumber, int Location) {
        return new Ball(ballNumber, Location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;

        Ball ball = (Ball) o;

        if (ballNumber != null ? !ballNumber.equals(ball.ballNumber) : ball.ballNumber != null) return false;
        return location != null ? location.equals(ball.location) : ball.location == null;
    }

    @Override
    public int hashCode() {
        int result = ballNumber != null ? ballNumber.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    public BallStatus matchBall(Ball userBall) {
        if (this.equals(userBall)) {
            return BallStatus.STRIKE;
        }
        if (this.ballNumber.equals(userBall.ballNumber)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

}
