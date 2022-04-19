package programmers.w3;

import java.util.Scanner;
public class harshad {
        public static boolean solution(int x) {
            boolean answer = true;
            // int → String
            String s = String.valueOf(x);
            int sum = 0;
            // 한 글자씩 잘라 배열에 담기
            String[] arr = s.toString().split("");
            // 자릿수 합
            for(int i = 0; i<arr.length; i++){
                sum += Integer.parseInt(arr[i]);
            }
            // 하샤드 수 인지
            if(x % sum == 0) answer = true;
            else answer = false;

            return answer;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                System.out.println(solution(num));

        }
}

