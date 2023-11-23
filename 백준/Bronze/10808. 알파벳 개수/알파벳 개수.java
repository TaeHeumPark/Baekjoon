import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toCharArray();

        int[] cnt = new int[26];

        for(int i = 0; i < arr.length; i++) {
            cnt[arr[i]-97]++;
        }

        for(int c : cnt) {
            System.out.print(c + " ");
        }
    }
}