package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson120803Test {
    @Test
    @DisplayName("성공")
    void success() {
        int result = new Lesson120803().solution(2, 3);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("실패")
    void fail() {
        int result = new Lesson120803().solution(88, 7);
        assertThat(result).isNotEqualTo(88);
    }
}