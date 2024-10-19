import java.util.*;
public class karatsubalgo {
    public static int karatsuba(int x, int y) {
        if (x < 10 || y < 10) {
            return x * y; 
        }

        int m = Math.max(getNumDigits(x), getNumDigits(y)); 
        int halfM = m / 2;
        int powerOf10 = (int) Math.pow(10, halfM);  // 10^halfM for splitting the numbers

        // Split the numbers into parts
        int a = x / powerOf10;
        int b = x % powerOf10;
        int c = y / powerOf10;
        int d = y % powerOf10;

        // Recursively calculate products
        int ac = karatsuba(a, c);
        int bd = karatsuba(b, d);
        int abcd = karatsuba(a + b, c + d);

        // Combine the results using the Karatsuba formula
        int result = ac * (int) Math.pow(10, 2 * halfM) + (abcd - ac - bd) * powerOf10 + bd;

        return result;
    }

    // Helper function to get the number of digits in a number
    private static int getNumDigits(int x) {
        return (x == 0) ? 1 : (int) Math.log10(x) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x = scanner.nextInt();
        System.out.print("Enter number 2: ");
        int y = scanner.nextInt();

        int product = karatsuba(x, y);  // Call the Karatsuba method
        System.out.println(product);
    }
}