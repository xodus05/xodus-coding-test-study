package programmers;

class Solution_21 {
    public static int solution(String s) {

        String[] num = {"0","1","2","3","4","5","6","7","8","9"};
        String[] eng = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};

        for(int i = 0; i<num.length; i++){
            s = s.replace(eng[i], num[i]);
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args){
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
    }
}
