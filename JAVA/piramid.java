
// public class piramid {

//     public static void main(String[] args) {
//         System.out.print("screen display ");
//         for (int i = 1; i < 5; i++) {
//             for (int j = 1; j < i; j++) {
//                 System.out.print(" ");
//                 System.out.print(i);
//             }

//             System.out.print("/n");
//         }
//     }

// }


 public class piramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("i");
            }
            System.out.println();
        }
    }
 }