package me.daily.programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson12941Test {

    @Test
    @DisplayName("성공")
    void success() {
        int result = new Lesson12941().solution(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(result);
    }
}