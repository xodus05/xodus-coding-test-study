package programmers;

class Solution_1 {
    public long[] solution_1 ( int x, int n){
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (i + 1) * (long)x;
        }
        return answer;
    }
}

