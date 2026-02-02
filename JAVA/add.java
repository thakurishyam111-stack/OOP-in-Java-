
public class add {

    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {

                sumEven += i;

            } else {
                sumOdd += i;
            }

        }
        System.out.println("the sumE is" + sumEven);
        System.out.println("the sumo is" + sumOdd);
        System.out.println("thanks ");

    }
}
