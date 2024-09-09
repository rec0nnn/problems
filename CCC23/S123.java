import java.util.*;

public class S123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int sum = 0;
        int arr[][] = new int[2][c];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 1) {
                    sum += 3;
                }
            }
        }
        // searching through the array to find touching triangles
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < c; j++) {
                if (j % 2 == 0) {
                    if (i == 0 && arr[i][j] == 1 && arr[1][j] == 1) {
                        sum -= 2;
                    }
                }
                if (j < c - 1 && arr[i][j] == 1 && arr[i][j + 1] == 1) {
                    sum -= 2;
                }
            }
        }
        sc.close();
        System.out.println(sum);
    }
}
