import java.util.Scanner;

public class Main {
	
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int change = sc.nextInt();
		
		int[] basket = new int[number+1];
		for(int i = 0; i <= number; i++) {
			basket[i] = i;
		}
		
		int temp = 0;
		
		for(int i = 0; i < change; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			temp = basket[num1];
			basket[num1] = basket[num2];
			basket[num2] = temp;
			
		}
		
		for(int i = 1; i <= number; i++) {
			sb.append(basket[i]).append(" ");
		}
		
		System.out.print(sb.toString());
	}

}
