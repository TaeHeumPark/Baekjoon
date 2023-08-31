import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 물건 가격
		int result = sc.nextInt();
		// 구매한 물품 종류 수
		int count = sc.nextInt();
		
		for(int i = 0; i < count; i++) {
			result -= sc.nextInt() * sc.nextInt();
			
			if(result < 0) {
				System.out.print("No");
				return;
			}
		}
		
		if(result != 0) {
			System.out.print("No");
			return;
		}
		
		System.out.print("Yes");
		
		
	}

}
