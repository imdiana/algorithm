package me.daily.programmers;

public class Lesson12909 {
//https://school.programmers.co.kr/learn/courses/30/lessons/12909

    boolean solution(String s) {
        //"()()"
        //"(())()"
        //")()("
        //"(()("
        //"((()()))"
        int leftParenthesis = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            if (i == 0 && chars[i] == ')') {
                return false;
            }

            if (chars[i] == '(') leftParenthesis++;
            else if (chars[i] == ')') {
                leftParenthesis--;

                if (leftParenthesis < 0)
                    return false;
            }

            if(i == chars.length -1 && leftParenthesis > 0) return false;
        }

        return true;
    }
}
