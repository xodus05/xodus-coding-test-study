package programmers;

import java.util.Arrays;

class Solution_19 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i = 0; i < phone_book.length-1; i++){
            if (phone_book[i+1].startsWith(phone_book[i]))
                return false;
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(new String[]{"119","97674223","1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
    }
}