package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.wrapper.BallNumber;
import io.github.EcoFriendlyAppleSu.baseball.wrapper.Location;

public class Ball {
    private BallNumber ballNumber;
    private Location location;

    public Ball(int ballNumber, int location) {
        this.ballNumber = new BallNumber(ballNumber);
        this.location = new Location(location);
    }


    public BallStatus matchBall(Ball user) {
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

        if (ballNumber != null ? !ballNumber.equals(ball.ballNumber) : ball.ballNumber != null) return false;
        return location != null ? location.equals(ball.location) : ball.location == null;
    }

    @Override
    public int hashCode() {
        int result = ballNumber != null ? ballNumber.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "ballNumber=" + ballNumber +
                ", location=" + location +
                '}';
    }
}
