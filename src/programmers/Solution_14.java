package programmers;

class Solution_14 {
    static int[] solution(int[] answers) {
        int[] answer;

        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2,4,2,5};
        int[] c = new int[]{3,3,1,1,2,2,4,4,5,5};

        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            if(answers[i] == a[i%5])  score[0]++;
            if(answers[i] == b[i%8])  score[1]++;
            if(answers[i] == c[i%10]) score[2]++;
        }

        int max = 0;
        for(int i=0; i<3; i++){
            if(score[i] > max){
                max = score[i];
            }
        }

        int cnt = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max){
                cnt++;
            }
        }

        answer = new int[cnt];

        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) {
                answer[idx++] = i+1;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,2,3,4,5}));
        System.out.println(solution(new int[]{1,3,2,4,2}));
    }
}
