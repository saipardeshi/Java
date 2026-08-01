import java.util.*;

/*
 * QUESTION 2: Maximum Subarray Sum with At Most One Deletion
 *
 * You are given an array of N integers.
 *
 * You must find a non-empty contiguous subarray. You may optionally select
 * exactly one element within this chosen subarray and negate its value
 * (i.e., change x to -x).
 *
 * Find the maximum possible sum of the resulting non-empty subarray.
 *
 * Input Format:
 * Line 1: N (size of the array)
 * Line 2: N space-separated integers, the array a[i]
 *
 * Constraints:
 * 1 <= N <= 10^5
 * -10^4 <= a[i] <= 10^4
 */
class Main2 {
    public static int solve(int N, int[] a) {
        long dp0 = a[0];   // best subarray ending here, no negation used
        long dp1 = -a[0];  // best subarray ending here, negation used
        long best = Math.max(dp0, dp1);

        for (int i = 1; i < N; i++) {
            long newDp0 = Math.max(a[i], dp0 + a[i]);
            long newDp1 = Math.max(dp0 - a[i], Math.max(dp1 + a[i], -a[i]));

            dp0 = newDp0;
            dp1 = newDp1;

            best = Math.max(best, Math.max(dp0, dp1));
        }

        return (int) best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        int result = solve(N, a);
        System.out.println(result);
    }
}