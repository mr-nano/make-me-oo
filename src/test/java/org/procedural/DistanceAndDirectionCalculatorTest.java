package org.procedural;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.procedural.DistanceAndDirectionCalculator.direction;
import static org.procedural.DistanceAndDirectionCalculator.distance;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Assertions.assertEquals(0, distance(0,0, 0,0));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Assertions.assertEquals(1, distance(0,0, 1,0));
        Assertions.assertEquals(1, distance(0,0, 0,1));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Assertions.assertEquals(2, distance(-1,0, 1,0));
    }

    @Test
    void originAndPointOnPositiveXAxisShouldBeZeroRadiansAway() {
        Assertions.assertEquals(0, direction(0,0, 1,0));
        Assertions.assertEquals(0, direction(0,0, 3,0));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Assertions.assertEquals(Math.PI, direction(0,0, -1,0));
        Assertions.assertEquals(Math.PI, direction(0,0, -3,0));
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Assertions.assertEquals(Math.PI / 2, direction(0,0, 0,3));
        Assertions.assertEquals(Math.PI / 2, direction(0,0, 0,1));
    }
}
