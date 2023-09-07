class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int[] one = new int[cards1.length];
        int[] two = new int[cards2.length];
        int[] result = new int[goal.length];
        
        for(int i = 0; i < cards1.length; i++) {
            one[i] = i;
        }
        
        for(int i = 0; i < cards2.length; i++) {
            two[i] = i+10;
        }
        
        for(int i = 0; i < goal.length; i++) {
            for(int j = 0; j < cards1.length; j++) {
                if(goal[i].equals(cards1[j])) {
                    result[i] = one[j];
                    break;
                }
            }
            for(int j = 0; j < cards2.length; j++) {
                if(goal[i].equals(cards2[j])) {
                    result[i] = two[j];
                    break;
                }
            }
        }
        
        
        
        for(int i = 1; i < goal.length; i++) {
            int tmp = result[i];
            if(result[i] >= 10) {
                for(int j = i-1; j >= 0; j--) {
                    if(result[j] > result[i]) {
                        return "No";
                    } else {
                        if(result[j] < 10) continue;
                        tmp--;
                        if(result[j] != tmp)
                            return "No";
                    }
                }
            } else {
                for(int j = i-1; j >= 0; j--) {
                    if(result[j] > result[i] && result[j] < 10){
                        return "No";
                    } else {
                        if(result[j] >= 10) continue;
                        tmp--;
                        if(result[j] != tmp)
                            return "No";
                    }
                }
            }
        }
        
        return answer;
    }
}