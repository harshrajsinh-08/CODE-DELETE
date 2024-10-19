import java.util.*;
public class RotateArray{
    public static void rotateToLeft(int[] arr,int n,int k){
        if(n==0) return;
        k%=n;
        if(k==0) return;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i] = arr[i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
    }

    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations");
        int k = sc.nextInt();
        rotateToLeft(arr,n,k);
        System.out.println("Array after rotating left by "+k+" positions");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
