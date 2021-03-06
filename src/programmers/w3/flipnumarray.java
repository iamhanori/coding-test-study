package programmers.w3;

import java.util.Scanner;
public class flipnumarray {
        public static StringBuilder solution(long n) {
            // long → String
            String s = String.valueOf(n);

            // reverse()메소드를 이용하기 위하여
            // StringBuilder 인스턴스 생성
            StringBuilder sb = new StringBuilder(s);

            // reverse()로 문자열 뒤집기
            sb.reverse();

            // String.split("")로 한 글자씩 잘라 배열에 담기
            String[] stringArr = sb.toString().split("");

            // 문자열 길이 만큼 배열 길이 할당
            int[] answer = new int[sb.length()];

            // String → int → int[]
            for(int i = 0; i < sb.length(); i++) {
                answer[i] = Integer.parseInt(stringArr[i]);
            }

            return sb;
        }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(solution(n));

        }
}
