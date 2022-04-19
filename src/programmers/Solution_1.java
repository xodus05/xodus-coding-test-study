package programmers;

//x만큼 간격이 있는 n개의 숫자
class Solution_1 {
    public static void main(String[] args) {
        System.out.println(solution_1(2,5));
        System.out.println(solution_1(4,3));
    }

    public static long[] solution_1(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (i + 1) * (long) x;
        }
        return answer;
    }
}
