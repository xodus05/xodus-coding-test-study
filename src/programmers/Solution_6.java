package programmers;

class Solution_6 {
    public static int solution(int n) {
        int answer = 0;
        for(int x = 1; x<n; x++){
            if(n%x==1){
                answer += x;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        int n = 10;
        int n1 = 12;

        System.out.println(solution(n));
        System.out.println(solution(n1));
    }
}