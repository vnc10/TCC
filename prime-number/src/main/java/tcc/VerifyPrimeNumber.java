package tcc;

public class VerifyPrimeNumber {

    private int number;

    public VerifyPrimeNumber(int numero) {
        number = numero;
    }

    public int verify() {
        int i, m = 0, flag = 0;
        int n = this.number;
        m = n / 2;
        if (n == 0 || n == 1) {
            return 0;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    flag = 1;
                    return 0;
                }
            }
            return 1;
        }
    }
}
