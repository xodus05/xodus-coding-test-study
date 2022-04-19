package programmers;

import java.util.*;

public class Solution_9 {
    public static int solution(int n) {
        int answer = 0;

        while(n!=0){
            answer += n%10; //123%10 -> answer=3
            n = n/10;   // 123/10 -> 12
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(123));
        System.out.println(solution(987));
    }
}
