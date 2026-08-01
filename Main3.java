import java.util.*;

/*
 * QUESTION 3: Min Cost Paint Posts — No 3 Consecutive Same Color
 *
 * You are given N posts in a row and K available colors.
 *
 * The cost of painting post i with color c is cost[i][c].
 *
 * You are also given an array fatigue, where fatigue[c] is an extra penalty
 * paid whenever two adjacent posts are both painted color c.
 *
 * You must paint every post exactly one color.
 *
 * Two consecutive posts may have the same color, but three consecutive posts
 * may not all have the same color.
 *
 * Find the minimum possible total cost, where the total cost is: sum of all
 * painting costs + sum of all fatigue penalties for equal adjacent pairs.
 *
 * Input Format:
 * Line 1: N (number of posts)
 * Line 2: K (number of colors)
 * Next N lines: K space-separated integers, row i of cost
 * Next line: K space-separated integers, the fatigue array
 *
 * Constraints:
 * 1 <= N <= 20000
 * 1 <= K <= 50
 * 1 <= cost[i][j] <= 10^4
 * 0 <= fatigue[i] <= 10^4
 */
class Main3 {
    public static int solve(int N, int K, int[][] cost, int[] fatigue) {
        long INF = Long.MAX_VALUE / 2;
        long[] dp1 = new long[K]; // min cost ending here, this post is 1st in its color run
        long[] dp2 = new long[K]; // min cost ending here, this post is 2nd in its color run

        for (int c = 0; c < K; c++) {
            dp1[c] = cost[0][c];
            dp2[c] = INF;
        }

        for (int i = 1; i < N; i++) {
            long best1 = INF, best2 = INF;
            int best1Idx = -1;
            for (int c = 0; c < K; c++) {
                long val = Math.min(dp1[c], dp2[c]);
                if (val < best1) {
                    best2 = best1;
                    best1 = val;
                    best1Idx = c;
                } else if (val < best2) {
                    best2 = val;
                }
            }

            long[] newDp1 = new long[K];
            long[] newDp2 = new long[K];

            for (int c = 0; c < K; c++) {
                long bestOther = (c != best1Idx) ? best1 : best2;
                newDp1[c] = cost[i][c] + bestOther;
                newDp2[c] = cost[i][c] + fatigue[c] + dp1[c];
            }

            dp1 = newDp1;
            dp2 = newDp2;
        }

        long ans = INF;
        for (int c = 0; c < K; c++) {
            ans = Math.min(ans, Math.min(dp1[c], dp2[c]));
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] cost = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) cost[i][j] = sc.nextInt();
        }
        int[] fatigue = new int[K];
        for (int i = 0; i < K; i++) fatigue[i] = sc.nextInt();

        int result = solve(N, K, cost, fatigue);
        System.out.println(result);
    }
}