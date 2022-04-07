package me.daily.programmers;

/**
 * LV2
 */
public class Lesson12951 {
    //https://school.programmers.co.kr/learn/courses/30/lessons/12951

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s + "/";
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            if (i != 0) sb.append(" ");
            if ("/".equals(a[i])) break;
            if (a[i].length() < 2) sb.append(a[i].toUpperCase());
            else sb.append(a[i].substring(0, 1).toUpperCase()).append(a[i].substring(1).toLowerCase().replace("/", ""));

        }
        return sb.toString();
    }
}
