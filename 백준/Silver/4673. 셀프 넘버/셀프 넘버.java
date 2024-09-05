import java.util.*;

public class Main {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int N = 0, sum = 0;
		boolean arr[] = new boolean[10500];
		
		for(int i = 1; i < 10000; i++) {
			N = i;
			sum = N;
			
			while(N > 0) {
				sum += N % 10;
				N /= 10;
			}
			arr[sum] = true;
		}
		
		for(int i = 1; i < 10000; i++) {
			if(!arr[i]) {
				sb.append(i + "\n");
			}
		}
		
		System.out.print(sb.toString());
	}

}