import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            String input = sc.next();
            switch (input) {
                case "push" :
                    stack.push(sc.nextInt());
                    break;
                case "pop" :
                    if(stack.isEmpty())
                        sb.append("-1 ");
                    else
                        sb.append(stack.pop());
                    sb.append("\n");
                    break;
                case "size" :
                    if(!stack.isEmpty())
                        sb.append(stack.size());
                    else
                        sb.append(0);
                    sb.append("\n");
                    break;
                case "empty" :
                    if(stack.isEmpty())
                        sb.append(1);
                    else
                        sb.append(0);
                    sb.append("\n");
                    break;
                default:
                    if(stack.isEmpty())
                        sb.append(-1);
                    else
                        sb.append(stack.peek());
                    sb.append("\n");
                    break;
            }
        }
        if(sb.length() > 0) {
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.print(sb.toString());
    }
}