package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To7To12Then12() {
        int first = 9;
        int second = 7;
        int third = 12;
        int result = Max.max(first, second, third);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To9To12To23Then23() {
        int first = 9;
        int second = 9;
        int third = 12;
        int fourth = 23;
        int result = Max.max(first, second, third, fourth);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }
}