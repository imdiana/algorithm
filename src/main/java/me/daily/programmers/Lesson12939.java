package me.daily.programmers;

import java.util.Arrays;

/**
 * LV2
 */
public class Lesson12939 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12939

    public String solution(String s) {
        int[] intArrays = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(intArrays).min().getAsInt() + " " + Arrays.stream(intArrays).max().getAsInt();
    }
}
