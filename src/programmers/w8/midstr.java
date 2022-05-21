package programmers.w8;

public class midstr {
        public String solution(String s) {
            String answer = "";

            return answer = (s.length()%2==0) ? s.substring(s.length()/2-1, s.length()/2+1) : s.substring(s.length()/2,s.length()/2+1);
        }
}

