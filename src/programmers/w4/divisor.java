package programmers.w4;

import java.util.Scanner;
public class divisor {
        public static int solution(int left, int right) {
            int answer = 0;

            for(int i = left; i <= right; i++) {
                int cnt = 0;

                for(int j = 1; j <= i; j++) {
                    if(i % j == 0) cnt++;
                }

                if(cnt % 2 == 0) answer += i;
                else answer -= i;
            }

            return answer;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(solution(l, r));


        }

}

