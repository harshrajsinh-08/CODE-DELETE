import java.util.Scanner;

class maxeqbsum {
    static int findMaxSum(int[] arr, int n) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prefixSum = arr[i];
            for (int j = 0; j < i; j++) {
                prefixSum += arr[j];
            }
            int suffixSum = arr[i];
            for (int j = n - 1; j > i; j--) {
                suffixSum += arr[j];
            }
            if (prefixSum == suffixSum) {
                res = Math.max(res, prefixSum);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(findMaxSum(arr, n));
    }
}