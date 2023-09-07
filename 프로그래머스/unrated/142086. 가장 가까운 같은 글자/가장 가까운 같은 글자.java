class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        char[] chArr = s.toCharArray();
        int cnt;
        
        answer[0] = -1;
        
        for(int i = 1; i < chArr.length; i++) {
            cnt = 1;
            for(int j = i - 1; j >= 0; j--) {
                if(chArr[j] == chArr[i]){
                    answer[i] = cnt;
                    break;
                    }
                else
                    cnt++;
            }
            if(answer[i] == 0)
                answer[i] = -1;
        }
        
        return answer;
    }
}