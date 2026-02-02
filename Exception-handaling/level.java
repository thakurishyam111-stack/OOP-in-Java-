public class level
{
    public static void main(String[] args) {
        int a= 5, b=0, c;
        try {
            c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        try {
            int[] arr = new int[10];
            arr[25] = 50;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        
// using nulll pointer
        String str = "ram";
        try {
            System.out.println("the length of arr is = "+str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        }
    }
}