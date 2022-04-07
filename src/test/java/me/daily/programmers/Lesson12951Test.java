package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class Lesson12951Test {

    @Test
    @DisplayName("성공")
    void success() {
        String result = new Lesson12951().solution("3people unFollowed me");
        assertThat(result).isEqualTo("3people Unfollowed Me");
    }

    @Test
    @DisplayName("실패")
    void fail() {
        String result = new Lesson12951().solution("a   4   ");
        System.out.println(result);
    }
}