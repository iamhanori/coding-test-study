package programmers.w1;

import java.util.Scanner;
public class in_sq {
    public static long solution(long n) {
        long answer = 0;
        answer = (long) Math.sqrt(n);
        if (n == (long) Math.pow(answer, 2)) {
            answer = (long) Math.pow(answer + 1, 2);
        } else
            answer = -1;

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(solution(n));

    }
}
