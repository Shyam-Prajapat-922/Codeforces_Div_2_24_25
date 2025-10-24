import java.util.*;

public class Main {

    public static int countOperations(int n, String s) {
        int count = 0;
        int len = s.length();
      
        for (int i = 1; i < 31; i++) {
            for (int j = 0; j < len; j++) {
                if (s.charAt(j) == 'A') n--;
                else n >>= 1;
                count++;
                if (n == 0) return count;
            }
        }
        return count + n ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        while (test -- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();

            for (int i = 0; i < q; i++) {
                int val = sc.nextInt();
                System.out.println(countOperations(val, s));
            }
        }
        sc.close();
    }
}
