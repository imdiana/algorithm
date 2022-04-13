package me.daily.programmers;

public class Lesson12932 {
    public int[] solution(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int[] answer = new int[charArray.length];
        for(int i=0; i<charArray.length; i++) {
            answer[charArray.length-i-1] = Character.getNumericValue(charArray[i]);
        }
        //String.valueOf(n).codePoints().mapToObj(c-> (char)c).collect(Collectors.toList());
        //new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();

        return answer;
    }
}
