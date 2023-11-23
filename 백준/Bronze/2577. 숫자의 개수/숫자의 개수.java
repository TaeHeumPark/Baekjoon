import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        char[] result = (String.valueOf(A * B * C)).toCharArray();

        int[] arr = new int[10];

        for(char c : result) {
            arr[c-'0']++;
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}