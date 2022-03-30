package programmers;

public class Solution {
    public static void main(String[] args){
        System.out.println(solution(3));
        System.out.println(solution(4));
    }
    public static String solution(int num) {
        if(num%2==0) //짝수일경우
            return "Even";
        else if(num%2==1) //홀수일경우
            return "Odd";
        String answer = "";
        return answer;
    }
}
