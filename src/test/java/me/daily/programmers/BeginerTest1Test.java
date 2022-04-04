package me.daily.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeginerTest1Test {
    @Test
    void test() {
        int a = new BeginerTest1().solution("-1234");
        assertThat(a).isEqualTo(-1234);
    }
}