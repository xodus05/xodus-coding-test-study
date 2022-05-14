package programmers;

class Solution_22 {
    public static int solution(long num) {
        int cnt = 0;

        while(num!=1) {
            if(num % 2 == 0 ){
                num/=2;
            }
            else {
                num = num*3+1;
            }

            cnt++;
            if(cnt > 500){
                return -1;
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
}
