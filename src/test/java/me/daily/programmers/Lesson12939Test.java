package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Lesson12939Test {

    @Test
    @DisplayName("성공")
    void success() {
        String s = "1 2 3 4";
        String result = new Lesson12939().solution(s);
        assertThat(result).isEqualTo("1 4");
    }

    @Test
    @DisplayName("실패")
    void fail() {
        String s = "-1 -4";
        String result = new Lesson12939().solution(s);
        assertThat(result).isNotEqualTo("-1 -4");
    }

}