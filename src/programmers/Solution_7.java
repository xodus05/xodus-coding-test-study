package programmers;

class Solution_7 {
    public static int solution(String s) {
        int answer = 0;
        // 원하는 타입을 문자열로 바꿀때에 Integer.parseInt(String s)를 넣어주면 int 형으로 바뀐다.
        answer = Integer.parseInt(s);
        //parseDouble 등등 모든 타입으로 변환시킬수 있다.
        return answer;
    }
    public static void main(String[] args){
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }
}