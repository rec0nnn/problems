import java.util.*;

public class S224 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String line;
        for (int i = 0; i < n; i++) {
            int[] letters = new int[26];
            line = sc.next();
            for (int j = 0; j < m; j++) {
                int a = line.charAt(j) - 97;
                letters[a]++;
            }
            int a = line.charAt(0) - 97;
            if (letters[a] > 1) {
                for (int j = 1; j < m; j++) {
                    a = line.charAt(j) - 97;
                    if (letters[a] <= 1 && j % 2 == 0) {
                        System.out.println('F');
                        break;
                    } else if (letters[a] > 1 && j % 2 == 1) {
                        System.out.println('F');
                        break;
                    } else if (j == m - 1) {
                        System.out.println('T');
                    }
                }
            } else {
                for (int j = 1; j < m; j++) {
                    a = line.charAt(j) - 97;
                    if (letters[a] > 1 && j % 2 == 0) {
                        System.out.println('F');
                        break;
                    } else if (letters[a] <= 1 && j % 2 == 1) {
                        System.out.println('F');
                        break;
                    } else if (j == m - 1) {
                        System.out.println('T');
                    }
                }
            }
        }
    }

}