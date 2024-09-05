import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		String arr[] = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				// 같은 길이 단어
				if(s1.length() == s2.length()) {
					// 사전 순으로 정렬
					return s1.compareTo(s2);
				}else {
					return s1.length() - s2.length();
				}
			}
		});
		
		sb.append(arr[0]).append("\n");
		for(int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i-1]))
				sb.append(arr[i]).append("\n");
		}
		
		
		System.out.print(sb.toString());
	}

}