class Solution {
    public int solution(int num) {
        
        if(num == 1) return 0;
        
        int answer = 0;
        
        while(num != 1) {
            if(num % 2 == 1) {
                num = (num * 3) + 1;
            } else {
                num /= 2;
            }
            answer++;
            
            if(answer == 500) return -1;
        }
        
        return answer;
    }
}