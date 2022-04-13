package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Lesson12932Test {
    @Test
    @DisplayName("성공")
    void success() {

        int[] result = new Lesson12932().solution(12345);
        assertThat(result).isEqualTo(new int[]{5,4,3,2,1});

    }

}