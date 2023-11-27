import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            queue.add(sc.nextInt());
        }

        for(int i = 1; i <= N; i++) {
            stack.push(i);
            sb.append("+\n");
            while(!stack.isEmpty() && !queue.isEmpty() && Objects.equals(queue.peek(), stack.peek())) {
                sb.append("-\n");
                stack.pop();
                queue.poll();
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        if(stack.isEmpty() && queue.isEmpty())
            System.out.print(sb.toString());
        else
            System.out.print("NO");
    }
}