package programmers;

class Solution_15 {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];// 제일 작은 수를 제외한 arr 배열 값 저장

        int[] a = {-1}; //배열 길이가 1일 경우
        if(arr.length == 1){
            return a;
        }

        int min = arr[0]; //최소값 구하기 min 초기화
        for(int i = 0; i<arr.length; i++){
            if(min>arr[i]) {
                min = arr[i];
            }
        }

        int cnt = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == min){ // 작은수와 일치하면 continue 아닐경우 answer에 담기
                continue;
            }
            answer[cnt] = arr[i];
            cnt++;
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println((new int[]{4,3,2,1}));
        System.out.println((new int[]{10}));
    }
}