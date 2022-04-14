package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson12931Test {
    @Test
    @DisplayName("성공")
    void success() {
        int result = new Lesson12931().solution(123);
        assertThat(result).isEqualTo(6);
    }
}