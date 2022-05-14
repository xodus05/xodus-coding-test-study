package programmers;

class Solution_23 {
    public static long solution(int price, int money, int count) {
        long answer = -1;
        long tomoney = 0;

        for(int i = 1; i<=count; i++){
            tomoney += price*i;
        }

        answer = tomoney - money;

        if(money > tomoney){
            return 0;
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(3,20,4));
    }
}
