import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int answer = (V - B) / (A - B);
		int remainder = (V - B) % (A - B);
		if(remainder != 0) {
			answer++;
		}
		System.out.println(answer);
	}

}