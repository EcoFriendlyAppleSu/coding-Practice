package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.wrapper.BallNumber;
import io.github.EcofriendlyAppleSu.baseball.wrapper.Location;

public class Ball {
    private Location location;
    private BallNumber ballNumber;

    public Ball(int location, int ball) {
        this.location = new Location(location);
        this.ballNumber = new BallNumber(ball);
    }

    public BallStatus matchEachBall(Ball user) {
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

        if (location != null ? !location.equals(ball.location) : ball.location != null) return false;
        return ballNumber != null ? ballNumber.equals(ball.ballNumber) : ball.ballNumber == null;
    }

    @Override
    public int hashCode() {
        int result = location != null ? location.hashCode() : 0;
        result = 31 * result + (ballNumber != null ? ballNumber.hashCode() : 0);
        return result;
    }
}
