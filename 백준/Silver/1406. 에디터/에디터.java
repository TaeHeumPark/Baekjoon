import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str = sc.next();

        Stack<Character> stack = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            stack.add(str.charAt(i));
        }

        int M = sc.nextInt();

        for(int i = 0; i < M; i++) {
            switch (sc.next()) {
                case "L" :
                    if (!stack.isEmpty()) {
                        stack2.add(stack.pop());
                    }
                break;
                case "D" :
                    if (!stack2.isEmpty()) {
                        stack.add(stack2.pop());
                    }
                break;
                case "B" :
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                break;
                case "P" :
                    stack.add(sc.next().charAt(0));
                break;
            }
        }
        while(!stack.isEmpty()) {
            stack2.add(stack.pop());
        }

        while(!stack2.isEmpty()) {
            sb.append(stack2.pop());
        }
        
        System.out.print(sb.toString());
    }
}