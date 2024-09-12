import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        List<Integer> list = new ArrayList<>();
        int[] frequency = new int[8001];  // -4000 ~ 4000까지 카운팅 배열
        double sum = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, modeValue = 0, modeCount = 0;
        boolean secondMode = false; // 두 번째 최빈값을 구하기 위한 플래그
        
        // 입력 받기 및 초기 처리
        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            list.add(num);
            sum += num;
            frequency[num + 4000]++;  // 음수를 처리하기 위해 +4000
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        Collections.sort(list);
        
        // 최빈값 구하기
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > modeCount) {
                modeCount = frequency[i];
                modeValue = i - 4000;  // 다시 원래 숫자로 복원
                secondMode = false;
            } else if (frequency[i] == modeCount && !secondMode) {
                modeValue = i - 4000;
                secondMode = true;  // 두 번째로 작은 최빈값을 찾아서 설정
            }
        }
        
        // 결과 출력
        sb.append(Math.round(sum / T)).append("\n");  // 산술평균
        sb.append(list.get((T - 1) / 2)).append("\n");  // 중앙값
        sb.append(modeValue).append("\n");  // 최빈값
        sb.append(max - min);  // 범위
        
        System.out.print(sb.toString());
    }
}