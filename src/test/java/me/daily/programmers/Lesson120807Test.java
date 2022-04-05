package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Lesson120807Test {

    @Test
    @DisplayName("성공")
    void success() {
        int result = new Lesson120807().solution(1, 2);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    @DisplayName("실패")
    void fail() {
        int result = new Lesson120807().solution(1, 2);
        assertThat(result).isNotEqualTo(1);
    }

}