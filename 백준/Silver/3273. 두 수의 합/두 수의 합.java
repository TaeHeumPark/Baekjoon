import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int end = n;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int x = sc.nextInt();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = end - 1; j > i; j--) {
                if(arr[i] + arr[j] == x) {
                    cnt++;
                    end = j;
                    break;
                }
            }
        }

        System.out.print(cnt);
    }
}