import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		
		Collections.sort(list);
		
		for(int i : list) {
			sb.append(i + "\n");
		}
		
		System.out.print(sb.toString());
	}

}