public class VerifyPrimeNumber {
    public static int verify(int number) {
        int i, m = 0, flag = 0;
        int n = number;
        int r = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            r = 0;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    r = 0;
                }
            }
            if (flag == 0) {
                r = 1;
            }
        }
        return r;
    }
}
