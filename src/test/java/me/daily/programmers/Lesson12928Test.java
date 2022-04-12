package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson12928Test {

    @Test
    @DisplayName("성공")
    void success() {
        int result = new Lesson12928().solution(1);
        assertThat(result).isEqualTo(1);
    }
}