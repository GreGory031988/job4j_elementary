package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To9Then9() {
        int left = 9;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To4Then7() {
        int left = 9;
        int right = 9;
        int result = Max.max(left, right);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}