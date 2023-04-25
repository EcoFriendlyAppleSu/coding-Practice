package io.github.EcofriendlyAppleSu.baseball;

public class Ball {

    private BallNumber ballNumber;
    private Location location;

    private Ball(int ballNumber, int locationNumber) {
        this.ballNumber = BallNumber.from(ballNumber);
        this.location = Location.from(locationNumber);
    }

    public static Ball of(int ballNumber, int locationNumber) {
        return new Ball(ballNumber, locationNumber);
    }

    public BallStatus match(Ball ball) {
        if (isStrike(ball)) {
            return BallStatus.STRIKE;
        }
        if (isBall(ball)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean isStrike(Ball ball) {
        return this.equals(ball);
    }

    private boolean isBall(Ball ball) {
        return this.ballNumber.equals(ball.ballNumber) && !this.location.equals(ball.location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ball)) {
            return false;
        }

        Ball ball = (Ball) o;

        if (ballNumber != null ? !ballNumber.equals(ball.ballNumber) : ball.ballNumber != null) {
            return false;
        }
        return location != null ? location.equals(ball.location) : ball.location == null;
    }

    @Override
    public int hashCode() {
        int result = ballNumber != null ? ballNumber.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
}
