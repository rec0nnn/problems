import java.util.*;

public class S124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        int half = n / 2;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < half; i++) {
            if (arr[i + (half)] == arr[i]) {
                counter += 2;
            }
        }
        System.out.println(counter);
    }
}
