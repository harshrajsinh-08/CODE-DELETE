import java.util.Scanner;

public class EuclidAlgorithmRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);

        sc.close();
    }

    public static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        return findGCD(b % a,a);
    }
}