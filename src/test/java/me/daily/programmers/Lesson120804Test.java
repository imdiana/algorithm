package me.daily.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Lesson120804Test {

    @Test
    @DisplayName("성공")
    void success() throws Exception {
        int result = new Lesson120804().solution(80, 3);
        assertThat(result).isEqualTo(240);
    }

    @Test
    @DisplayName("실패")
    void fail() {
        int result = new Lesson120804().solution(80, -1);
        assertThat(result).isEqualTo(0);
    }

}