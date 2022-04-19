package programmers;

class Solution_11 {
    public static int[] solution(long n) {
        String str = String.valueOf(n); //숫자 12345를 문자열 "12345" 로 바꿔준다.
        int num = str.length(); //str의 길이 5
        int[] answer = new int[num];

        for(int i = 0; i<num; i++){
            answer[i] = (int)(n % 10); //long타입에서 int 타입으로 형변환
            n /= 10;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(12345));
        System.out.println(solution(67891));
    }
}
