import java.util.*;

class Solution {
    
    StringBuilder sb = new StringBuilder();
    
    public String solution(String s) {
        String answer = "";
        
        if(s.charAt(0) >= 97 && s.charAt(0) <= 122)
            sb.append(Character.toUpperCase(s.charAt(0)));
        else
            sb.append(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++) {
            
            if(s.charAt(i-1) == ' ' && s.charAt(i) >= 97 && s.charAt(i) <= 122){
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else if(s.charAt(i-1) == ' ') {
                sb.append(s.charAt(i));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        
        answer = sb.toString();                                                        
                                                                
        return answer;
    }
}