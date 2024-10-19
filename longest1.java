import java.util.Scanner;

class longest1 {
    public static int findmax1(int[] a, int k) {
        int maxOnes = 0, numReplacements = 0, windowStart = 0;

        for (int windowEnd = 0; windowEnd < a.length; windowEnd++) {
            if (a[windowEnd] == 0) {
                numReplacements++;
            }
            while (numReplacements > k) {
                if (a[windowStart] == 0) {
                    numReplacements--;
                }
                windowStart++;
            }
            maxOnes = Math.max(maxOnes, windowEnd - windowStart + 1);
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0};
        int k = 1;
        System.out.println(findmax1(a, k));
    }
}