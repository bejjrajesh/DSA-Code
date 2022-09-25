package scaler.dsa.misc;

/*  For a given integer N, you have to tell whether it is a perfect number or not.
    A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 */

class PerfectNumber {

    public static void main(String[] args) {

        System.out.print(isPerfectNumber(4));
        System.out.print(isPerfectNumber(6));
    }

    /*  Brute Force Approach:
        Iterate from 1 to N and add each number that divides given number to the sum. Finally, check if sum is equals to given number.

        Time Complexity  : O(N)
        Space Complexity : O(1)
    */
    public static boolean isPerfectNumber(int N) {
        int sum = 1;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                sum += N/i;
            }
        }
        return sum == N;
    }

    /*
      Since factors always comes in pair(i, N/i), iterate from 1 to Sqrt(n) and add to sum.
      Finally, check if sum is equals to given number.

      Time Complexity  : O(Sqrt(N))
      Space Complexity : O(1)
    */
    public static boolean isPerfectNumberOptimised(int N) {
        int sum = 1;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                sum += i;
                sum += N/i;
            }
        }
        return sum == N;
    }
}