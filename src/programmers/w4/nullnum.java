package programmers.w4;

public class nullnum {
        public int solution(int[] numbers) {
            int answer = 45;
            for(int i = 0; i<numbers.length; i++){
                answer -= numbers[i];
            }
            return answer;
        }
}
