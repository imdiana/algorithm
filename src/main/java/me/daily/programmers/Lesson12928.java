package me.daily.programmers;

import java.util.HashSet;
import java.util.Set;

public class Lesson12928 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12928

    public int solution(int n) {

        Set<Integer> set = new HashSet<>();

        if(n == 1) return 1;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                if (set.contains(i)) break;
                set.add(i);
                set.add(n / i);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sum();
    }
}
