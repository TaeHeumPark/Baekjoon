import java.util.Scanner;

public class Main {

	private static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int firstInput = sc.nextInt();
		int secondInput = sc.nextInt();
		
		int firstResult = firstInput*(secondInput % 10);
		int secondResult = (firstInput*(secondInput % 100) - firstResult) / 10;
		int thirdResult = firstInput * (secondInput / 100);
		
		sb.append(firstResult + "\n");
		sb.append(secondResult + "\n");
		sb.append(thirdResult + "\n");
		sb.append(firstResult + (secondResult * 10) + (thirdResult * 100));
		System.out.print(sb.toString());
	}

}
