import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int recycle = 0;
        
        // 마트에서 돌려주는 병 수 n / a * b
        // 나머지 병 수 n % a
        
        while(a <= n || a <= recycle) {
        
            while(a <= n) {
                recycle += n % a;
                n = n / a * b;
                answer += n;
            }

            recycle += n;
            n = 0;

            while(a <= recycle) {
                n += recycle % a;
                recycle = recycle / a * b;
                answer += recycle;
            }
            
            n += recycle;
            recycle = 0;
            
        }
        
        return answer;
    }
}