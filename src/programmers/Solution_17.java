package programmers;

class Solution_17 {
    public static int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++){
            int a = 0;

            for(int j = 1; j <= i; j++){
                if(i%j==0) a++;
            }
            if(a%2==0)
                answer+=i;
            else
                answer-=i;
        }

        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(13,17));
        System.out.println(solution(24,27));
    }
}
