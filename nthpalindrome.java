import java.util.Scanner;

public class nthpalindrome {
    public static boolean isPalindrome(int n){
        String binary = Integer.toBinaryString(n);
        int i=0;
        int j=binary.length()-1;
        while(i<j){
            if(binary.charAt(i) == binary.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

   public static int findNthBinaryPalindrome(int n){
    int count = 0;
    int num=0;
    while(count<n){
        num++;
        if(isPalindrome(num)){
            count++;
        }
    }
    return num;
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int nthPalindrome = findNthBinaryPalindrome(n);
        System.out.println("The " + n + "th binary palindrome is: " + nthPalindrome);
    }
}