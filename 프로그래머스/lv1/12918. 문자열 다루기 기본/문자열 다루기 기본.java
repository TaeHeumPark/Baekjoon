class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() != 4 && s.length() != 6)
            return false;
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 48 || arr[i] > 57)
                return false;
        }
        
        return answer;
    }
}