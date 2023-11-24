import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 0; t < T; t++) {

            StringBuilder sb = new StringBuilder();

            Stack<Character> stack = new Stack<>();
            Stack<Character> stack2 = new Stack<>();

            char[] arr = sc.next().toCharArray();
            int M = arr.length;

            for(int i = 0; i < M; i++) {
                switch (arr[i]) {
                    case '<' :
                        if (!stack.isEmpty()) {
                            stack2.add(stack.pop());
                        }
                    break;
                    case '>' :
                        if (!stack2.isEmpty()) {
                            stack.add(stack2.pop());
                        }
                    break;
                    case '-' :
                        if (!stack.isEmpty()) {
                            stack.pop();
                        }
                    break;
                    default :
                        stack.add(arr[i]);
                        break;
                }
            }
            while(!stack.isEmpty()) {
                stack2.add(stack.pop());
            }

            while(!stack2.isEmpty()) {
                sb.append(stack2.pop());
            }

            System.out.println(sb.toString());
        }


    }
}