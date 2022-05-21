package programmers.w8;
import java.util.Arrays;

public class divisible {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
            if(answer.length == 0) answer = new int[] {-1};
            java.util.Arrays.sort(answer);
            return answer;
        }
}

