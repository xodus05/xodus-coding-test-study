package programmers;

// 핸트폰 번호 가리기
class Solution_3 {
    public String solution(String phone_number) {
        String answer = "";
        String str = new String(phone_number);

        //문자열의 길이를 알고싶을땐 length() 사용!!!
        for(int i = 0; i < str.length(); i++){

            if(i < str.length()-4){
                answer += "*";
            }
            else {
                //charAt(i) 의 의미는 String으로 저장된 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해준다.
                //charAt(?) ?는 index 번호를 뜻한다. 몇번째 번호를 가져올것인지!! i가 8이면 8번째에 있는 문자를 가져온다는 뜻!
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}