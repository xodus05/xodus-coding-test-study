package programmers;

class Solution_16 {
    public static int solution(int[] numbers) {
        int answer = 1+2+3+4+5+6+7+8+9;
        for(int i = 0; i<numbers.length; i++){
            answer -= numbers[i];
        }
        return answer;
    }
    public static void main(String[] args){
        int a[] = new int[]{1,2,3,4,6,7,8,0};
        int b[] = new int[]{5,8,4,0,6,7,9};

        System.out.println(solution(a));
        System.out.println(solution(b));
    }
}