import java.util.*;

/*
 * QUESTION 1: Minimum Makespan on M Machines (LPT)
 *
 * You are simulating a network dispatcher that routes an array of N tasks,
 * given by their base processing times, to M identical servers (numbered 1 to M).
 *
 * The dispatcher assigns tasks one by one according to the following strict
 * system protocols:
 *
 * 1. Priority Queueing: The dispatcher always selects the largest remaining
 *    unassigned task in the network. If multiple tasks have the exact same
 *    base processing time, it selects the one that appeared earliest in the
 *    original input sequence.
 *
 * 2. Load Balancing: The selected task is immediately assigned to the server
 *    with the lowest current total load. If multiple servers are tied for the
 *    lowest load, the task is routed to the server with the smallest ID.
 *
 * 3. Thermal Throttling (Fatigue): Because servers heat up, tasks take longer
 *    the more a server is used. The actual processing time added to a server's
 *    load is calculated as D + (k * W), where D is the task's base processing
 *    time, k is the number of tasks already assigned to this specific server
 *    prior to this task, and W is a constant thermal penalty parameter.
 *
 * Return the makespan, which is the maximum total load across all M servers
 * after all N tasks have been dispatched.
 *
 * Input Format:
 * Line 1: N (number of tasks)
 * Line 2: M (number of servers)
 * Line 3: W (thermal penalty parameter)
 * Line 4: N space-separated integers, the tasks array
 *
 * Constraints:
 * 1 <= N <= 10^5
 * 1 <= M <= 10^2
 * 0 <= W <= 10^3
 * 1 <= tasks[i] <= 10^4
 */
class Main {
    public static int solve(int N, int M, int W, int[] tasks) {
        Integer[] order = new Integer[N];
        for (int i = 0; i < N; i++) order[i] = i;

        Arrays.sort(order, (a, b) -> {
            if (tasks[b] != tasks[a]) return tasks[b] - tasks[a];
            return a - b;
        });

        PriorityQueue<long[]> servers = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Long.compare(a[0], b[0]);
            return Long.compare(a[1], b[1]);
        });

        for (int id = 1; id <= M; id++) {
            servers.add(new long[]{0L, id, 0L});
        }

        for (int idx : order) {
            long D = tasks[idx];

            long[] server = servers.poll();
            long load = server[0];
            long serverId = server[1];
            long k = server[2];

            long added = D + (k * W);
            long newLoad = load + added;

            servers.add(new long[]{newLoad, serverId, k + 1});
        }

        long makespan = 0;
        for (long[] server : servers) {
            makespan = Math.max(makespan, server[0]);
        }
        return (int) makespan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int W = sc.nextInt();
        int[] tasks = new int[N];
        for (int i = 0; i < N; i++) tasks[i] = sc.nextInt();

        int result = solve(N, M, W, tasks);
        System.out.println(result);
    }
}