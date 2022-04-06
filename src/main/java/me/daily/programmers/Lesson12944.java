package me.daily.programmers;

import java.util.Arrays;

public class Lesson12944 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12944

    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
