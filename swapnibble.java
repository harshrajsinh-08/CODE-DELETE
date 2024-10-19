import java.util.Scanner;

public class swapnibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int swapn = ((n & 0x0F)<<4)|((n&0xF0)>>4);
        String s = Integer.toBinaryString(n);
        String res = Integer.toBinaryString(swapn);
        System.out.println(0+s);
        System.out.println(0+res);
        System.out.println(n);
        System.out.println(swapn);
    }
}