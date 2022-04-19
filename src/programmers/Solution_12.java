package programmers;

class Solution_12 {
    public static boolean solution(int x) {
        boolean answer = true;
        int a = 0;
        int n = x;

        while(n!=0){
            a += n%10;
            n = n/10;
        }

        if(x%a==0) return answer;
        return false;
    }
    public static void main(String[] args){
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }
}