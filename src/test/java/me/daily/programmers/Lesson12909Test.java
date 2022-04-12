package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson12909Test {

    @Test
    @DisplayName("성공")
    void success() {
        boolean result = new Lesson12909().solution("((()()))");
        assertThat(result).isTrue();
    }
}