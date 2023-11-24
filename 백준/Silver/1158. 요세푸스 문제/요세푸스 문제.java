import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int K = sc.nextInt();
        int cursor = -1;

        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            list.addLast(i+1);
        }

        while(!list.isEmpty()) {
            for(int i = 0; i < K; i++) {
                cursor++;
            }
            cursor %= list.size();
            sb.append(list.get(cursor) + ", ");
            list.remove(cursor);
            cursor--;
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        System.out.print("<");
        System.out.print(sb.toString());
        System.out.print(">");
    }
}