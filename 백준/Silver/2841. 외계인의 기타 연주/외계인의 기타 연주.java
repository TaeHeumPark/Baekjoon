import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// 기타 줄 6개
		// 줄마다 P개의 프렛으로 구성
		// 한 줄의 여러 프렛을 누르면 가장 높은 음의 프렛 음 발생
		// 프렛을 누르거나 떼는 동작은 손가락 한 번 움직인 것으로 간주
		
		// 멜로디에 포함되어 있는 음의 수 N, 한 줄에 있는 프렛의 수 P
		// N개의 줄에는 멜로디의 한 음을 나타내는 두 정수
		// 첫번째는 줄의 번호, 두번째는 그 줄의 프렛 번호
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int P = sc.nextInt();
		int cnt = 0;

		Map<Integer, Stack<Integer>> map = new HashMap<>();
		
		for(int i = 1; i <= 6; i++) {
			map.put(i, new Stack<Integer>());
		}
		
		for(int i = 0; i < N; i++) {
			int key = sc.nextInt();
			int melody = sc.nextInt();

			if(map.get(key).isEmpty()) {
				map.get(key).push(melody);
				cnt++;
				continue;
			}
			
			if(map.get(key).peek() == melody) {
				continue;
			} else if((map.get(key).peek() < melody)) {
				map.get(key).push(melody);
				cnt++;
			} else {
				while(!map.get(key).isEmpty() && map.get(key).peek() > melody) {
					map.get(key).pop();
					cnt++;					
				}
				if(map.get(key).isEmpty() || map.get(key).peek() < melody) {
					map.get(key).push(melody);
					cnt++;
				} else if((map.get(key).peek() == melody)) {
					continue;
				}
			}
		}
		System.out.println(cnt);
	}
}