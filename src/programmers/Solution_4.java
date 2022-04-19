package programmers;


//정수 제곱근 판별
class Solution_4 {
    public static long solution(long n) {
        long answer = 0;
        long a = (long)Math.sqrt(n);

        if(Math.pow(a,2)==n)
            answer = (long)Math.pow(a+1,2);
        else
            answer = -1;

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(3));
        System.out.println(solution(121));
        System.out.println(solution(4));
    }
}