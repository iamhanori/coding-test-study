package programmers.w8;

import java.util.*;
public class samenum {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // (1)
        int num = -1; // 원소 0~9까지이므로 영향 안 받는 숫자
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != num) {
                arrList.add(arr[i]);
                num = arr[i];
            }
        }

        // (2)
        answer = new int[arrList.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}