package programmers.w1;
// 0331
public class phone_number {

    public String solution(String phone_number) {
        String answer = "";

        for(int i = 0; i < phone_number.length(); i++){
            if(i < phone_number.length()-4){
                answer += "*";
            }
            else {
                answer += phone_number.charAt(i);
            }
        }
        return answer;
    }

}