import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt(), sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.print(sum);
    }
}