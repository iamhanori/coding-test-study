package programmers.w2;

public class dot_product {
        public static int solution(int[] a, int[] b) {
            int answer=0;
            for(int i=0; i<a.length; i++){
                answer += a[i]*b[i];
            }
            return answer;
        }

        public static void main(String[] args){
            int[] a=new int[]{1,2,3,4};
            int[] b=new int[]{-3,-1,0,2};

            int[] c=new int[]{-1,0,1};
            int[] d=new int[]{1,0,-1};

            System.out.println(solution(a, b));
            System.out.println(solution(c, d));
        }
}


