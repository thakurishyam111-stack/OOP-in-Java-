
public class prime{
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            if (n == 0 || n == 1) {
                System.out.println(n + " is not prime");
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= n / 2; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }
}
