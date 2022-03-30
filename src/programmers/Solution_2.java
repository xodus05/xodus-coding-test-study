package programmers;

class Solution_2 {
    public static void main(String args[]) {
        int[] arr = new int[]{1,2,3,4};
        int[] arr1 = new int[]{5,5};
        System.out.println(solution(arr));
        System.out.println(solution(arr1));
    }
    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        return answer;
    }
}
