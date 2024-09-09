import java.util.*;

public class S223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int d = 0;
        int arr[] = new int[n];
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            a = i;
            b = i;
            d = 0;
            while (a < n && b >= 0) {
                d = d + Math.abs(arr[b] - arr[a]);
                if (d < ans[a - b]) {
                    ans[a - b] = d;
                }
                a++;
                b--;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            a = i + 1;
            b = i;
            d = 0;
            while (a < n && b >= 0) {
                d = d + Math.abs(arr[b] - arr[a]);
                if (d < ans[a - b]) {
                    ans[a - b] = d;
                }
                a++;
                b--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
