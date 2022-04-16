package programmers;

class Solution_10 {
    public static int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i<nums.length-2;i++){
            for(int j = i+1; j<nums.length-1;j++){
                for(int k = j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int a = 0;

                    for(int x = 2;  x <=sum/2; x++){
                        if(sum%x==0) {
                            a++;
                            break;
                        }
                    }
                    if(a==0) answer++;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,2,3,4}));
        System.out.println(solution(new int[]{1,2,7,6,4}));
    }
}
