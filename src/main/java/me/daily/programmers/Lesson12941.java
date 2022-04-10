package me.daily.programmers;

import java.util.Arrays;

/**
 * LV2
 */
public class Lesson12941 {
    public int solution(int[] A, int[] B) {
        //https://school.programmers.co.kr/learn/courses/30/lessons/12941
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        for (int i = 0; i<A.length; i++) {
            answer += A[i] * B[B.length-i-1];
        }

        return answer;
    }

}
