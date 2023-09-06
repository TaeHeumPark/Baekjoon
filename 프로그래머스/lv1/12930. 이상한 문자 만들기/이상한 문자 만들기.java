import java.util.*;

class Solution {
    
    StringBuilder sb = new StringBuilder();
    
    public String solution(String s) {
        String answer = "";
        boolean check = false;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' '){
                if(check){
                    sb.append(Character.toLowerCase(s.charAt(i)));
                    check = false;
                } else {
                     sb.append(Character.toUpperCase(s.charAt(i)));
                    check = true;
                }
            } else {
                sb.append(' ');
                check = false;
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}