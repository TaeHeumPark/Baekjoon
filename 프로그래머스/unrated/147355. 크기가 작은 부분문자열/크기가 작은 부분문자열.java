import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int tlen = t.length();
        int plen = p.length();
        long pnum = Long.parseLong(p);
        
        for(int i = 0; i < tlen-plen+1; i++) {
            if(Long.parseLong(t.substring(i, i+plen)) <= pnum) answer++;
        }
        
        return answer;
    }
}