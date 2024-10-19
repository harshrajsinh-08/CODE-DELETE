import java.util.*;
public class binarypalindrome{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        int len = binary.length();
        StringBuffer sb = new StringBuffer(binary);
        if(binary.equals(sb.reverse().toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}