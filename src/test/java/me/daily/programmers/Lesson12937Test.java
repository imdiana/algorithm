package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Lesson12937Test {
    @Test
    @DisplayName("성공")
    void success() {
        String result = new Lesson12937().solution(0);
        assertThat(result).isEqualTo("Even");
    }

    @Test
    @DisplayName("실패")
    void fail() {
        String result = new Lesson12937().solution(73);
        assertThat(result).isNotEqualTo("Even");
    }

}