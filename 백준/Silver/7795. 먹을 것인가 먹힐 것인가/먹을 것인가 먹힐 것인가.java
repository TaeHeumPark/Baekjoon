import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int cnt = 0;
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[] A = new int[N];
			int[] B = new int[M];
			
			for(int j = 0; j < N; j++) {
				A[j] = sc.nextInt();
			}
			
			for(int j = 0; j < M; j++) {
				B[j] = sc.nextInt();
			}
			
			Arrays.sort(A);
			Arrays.sort(B);
			int right = 0;
			
			for(int left = 0; left < N; left++) {
                // B[right]가 A[left]보다 작을 때만 right 증가
                while (right < M && A[left] > B[right]) {
                    right++;
                }
                // A[left]보다 작은 B의 개수를 cnt에 더함
                cnt += right;
            }
			System.out.println(cnt);
		}
		
	}

}