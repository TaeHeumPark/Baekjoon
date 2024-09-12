import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		String strNumber = "";
		boolean check = true;
		char[] arr;
		int cnt = 99;
		int differenceValue = 0;
		
		if(N < 100) {
			sb.append(N);
		} else {
			for(int i = 101; i <= N; i++) {
				check = true;
				strNumber = String.valueOf(i);
				arr = strNumber.toCharArray();
				differenceValue = arr[0] - arr[1];
				
				for(int j = 1; j < arr.length - 1; j++) {
					if(arr[j] - arr[j+1] != differenceValue) {
						check = false;
						break;
					}
				}
				
				if(check) cnt++;
			}	
		sb.append(cnt);
		}
		
		
		System.out.print(sb.toString());
	}

}