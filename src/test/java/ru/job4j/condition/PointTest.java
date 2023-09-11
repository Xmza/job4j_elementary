package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 2;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when30to20then2() {
        Point a = new Point(3, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 1;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to21then2Dot23() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        double expected = 2.23;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when20to20then0() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        double expected = 0;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to04to56then4() {
        Point a = new Point(0, 0, 5);
        Point b = new Point(0, 4, 6);
        double out = a.distance(b);
        double expected = 4;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to04to04then4() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 4, 4);
        double out = a.distance(b);
        double expected = 4;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}