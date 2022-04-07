package programmers.w2;

import java.util.Scanner;
public class stringinteger {
        public static int solution(String s) {
            int answer = Integer.parseInt(s);
            return answer;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(solution(s));
        }
}

