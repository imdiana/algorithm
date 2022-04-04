package me.daily.programmers;

import org.junit.jupiter.api.Test;

class BeginerTest2Test {

    @Test
    void test() {
        long[] a = new BeginerTest2().solution(-10000000,1000);
        System.out.println(a.length +" "+ a[999]);
    }
}