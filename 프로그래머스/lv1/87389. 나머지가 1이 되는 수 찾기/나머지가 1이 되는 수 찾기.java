class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 2 == 1) {
            return 2;
        }
        
        for(int i = 3; i <= 1000000; i+=2) {
            if(n % i == 1){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}