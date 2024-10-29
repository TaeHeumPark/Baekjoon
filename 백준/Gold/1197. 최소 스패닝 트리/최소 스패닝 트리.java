import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int V, E;
	static int[] p;
	static int[][] edges;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		V = sc.nextInt();
		E = sc.nextInt();
		
		edges = new int[E][3];
		
		for (int i = 0; i < E; i++) {
			edges[i][0] = sc.nextInt();
			edges[i][1] = sc.nextInt();
			edges[i][2] = sc.nextInt();
		}
		
		// 크로스핏 1단계 : 가중치 정렬
		Arrays.sort(edges, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[2] - o2[2];
			}
		});
		
		// 2단계
		// make-set
		p = new int[V+1];
		for (int i = 0; i < V+1; i++) {
			p[i] = i;
		}
		
		int ans = 0;
		int v = 0;
		
		// union?
		for (int i = 0; i < E; i++) {
			int x = edges[i][0];
			int y = edges[i][1];
			
			if(findset(x) != findset(y)) {
				union(x, y);
				v++;
				ans += edges[i][2];
			}
			
			if(v == V-1) break;
			
		}
		System.out.println(ans);

	}
	
	static int findset(int x) {
		if(x == p[x])
			return p[x];
		return p[x] = findset(p[x]);
	}
	
	static void union(int x, int y) {
		p[findset(x)] = findset(y);
	}

}