package programmers.w3;

import java.util.Arrays;
public class prime {
    public static int solution(int[] nums) {
        int answer = 0;
        boolean chk = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k]; // 값을 담아
                    if (num >= 2) // 경우의 수를 찾아서
                        chk = isprime(num);
                    if (chk == true) // 소수가 맞을 경우
                        answer++;

                }
            }

        }
        return answer;
    }

    public static boolean isprime(int num) {
        boolean check = true;
        if(num==2) { //소수일 때
            return check;

        }
        for(int i=2; i<num; i++) { // 소수가 아닐 때
            if(num%i ==0) {
                check = false;
                break;
            }
        }
        return check;
    }


    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums));
        System.out.println(solution(nums));
    }
}

