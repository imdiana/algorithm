package me.daily.programmers;

/**
 * LV0
 */
public class Lesson120804 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/120804
    public int solution(int num1, int num2) {
        // 0 ≤ num1, num2 ≤ 100
        if(num1 < 0 || num1 > 100
                || num2 < 0 || num2 > 100
        ) return 0;
        return num1 * num2;
    }
}
