package me.daily.programmers;

import java.util.Calendar;

/**
 * LV0
 */
public class Lesson120803 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/120803

    public int solution(int num1, int num2) {
        if(num1 < -50000 || num1 > 50000
                || num2 < -50000 || num2 > 50000
        ) return 0;
        return num1 - num2;
    }
}
