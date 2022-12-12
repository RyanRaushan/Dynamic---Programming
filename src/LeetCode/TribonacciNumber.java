package LeetCode;

class TribonacciNumber {
    // Iterative approach.
    public static int tribonacciIterative(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int tn = 0, t1 = 1, t2 = 1, t0 = 0;

        for (int i = 3; i <= n; i++) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return tn;
    }

    // Recursive approach ......
    public static int tribonacciRecursive(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int tn = tribonacciRecursive(n - 1) + tribonacciRecursive(n - 2) + tribonacciRecursive(n - 3);
        return tn;
    }

    // Dynamic programming || Recursive approach
    public static int tribb(int n, int[] dp) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }

        int ans1, ans2, ans3;

        if (dp[n - 1] == -1) {
            ans1 = tribb(n - 1, dp);
            dp[n - 1] = ans1;
        } else {
            ans1 = dp[n - 1];
        }

        if (dp[n - 2] == -1) {
            ans2 = tribb(n - 2, dp);
            dp[n - 2] = ans2;
        } else {
            ans2 = dp[n - 2];
        }

        if (dp[n - 3] == -1) {
            ans3 = tribb(n - 3, dp);
            dp[n - 3] = ans3;
        } else {
            ans3 = dp[n - 3];
        }

        return ans1 + ans2 + ans3;

    }

    public static int tribonacci(int n) {
        int[] dp = new int[n+1];

        for (int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }
        return tribb(n, dp);
    }

    public static void main(String[] args) {
        System.out.println(tribonacciRecursive(5));
        System.out.println(tribonacciIterative(8));
        System.out.println(tribonacci(6));
    }
}