import java.util.*;

class Solution {
    
    StringBuilder sb = new StringBuilder();
    
    public String solution(String s) {
        String answer = "";
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        String[] strArr = s.split(" ");
        
        for(int i = 0; i < strArr.length; i++) {
            max = Math.max(max, Integer.parseInt(strArr[i]));
            min = Math.min(min, Integer.parseInt(strArr[i]));
        }
        
        sb.append(min).append(" ").append(max);
        
        answer = sb.toString();
        
        return answer;
    }
}