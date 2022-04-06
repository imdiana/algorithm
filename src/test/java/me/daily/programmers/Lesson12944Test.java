package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson12944Test {
    @Test
    @DisplayName("성공")
    void success() {
        double result = new Lesson12944().solution(new int[]{1,2,3,4});
        assertThat(result).isEqualTo(2.5);
    }

    @Test
    @DisplayName("실패")
    void fail() {
        double result = new Lesson12944().solution(new int[]{5,5});
        assertThat(result).isNotEqualTo(6);
    }
}