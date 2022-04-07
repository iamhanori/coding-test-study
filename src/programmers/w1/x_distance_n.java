package programmers;

import java.util.Scanner;

public class x_distance_n {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
            answer[i]=(long)x * (i+1);
        }
        return answer;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        x_distance_n n = new x_distance_n();

        long arr[]=n.solution(sc.nextInt(), sc.nextInt());
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
