package me.daily.programmers;

public class Lesson12931 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12931
    public int solution(int n) {
        int sum = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
