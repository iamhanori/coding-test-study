package programmers.w2;

import java.util.Scanner;
public class remain1 {
        public static int solution(int n) {
            int answer = 0;
            for(int i=1; i<n; i++){
                if(n%i==1) {
                    answer = i;
                    break;
                }
            }
            return answer;
        }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
            

    }
}