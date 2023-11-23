import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        boolean check = false;

        char[] arr = (String.valueOf(N)).toCharArray();

        int[] cnt = new int[10];

        for(char c : arr) {
            cnt[c-'0']++;
        }
        if((cnt[6] + cnt[9]) % 2 == 1) check = true;
        cnt[6] = (cnt[6] + cnt[9]) / 2;
        cnt[9] = 0;
        if(check) cnt[6]++;

        for(int i : cnt) {
            max = Math.max(max, i);
        }

        System.out.print(max);
    }
}