class Solution {
    
    StringBuilder sb = new StringBuilder();
    
    public String solution(int[] food) {
        String answer = "";
        
        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 == 1)
                food[i]--;
        }
        
        for(int i = 1; i < food.length; i++) {
            for(int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }
        }
        
        answer += sb.toString()+"0";
        sb.reverse();
        answer += sb.toString();
        
        return answer;
    }
}