package scaler.dsa.misc;

/*  Given a Number find out if its prime number or not
    A Number is prime, if it has the following properties
    1) 1 and itself are factors
    2) Number of factors are two
* */

class PerfectNumber {

    public static void main(String[] args) {
        System.out.print("Is number 7 is prime : " + isPrimeNumber(7));
        System.out.print("Is number 7 is prime : " + isPrimeNumber(173));
        System.out.print("Is number 7 is prime : " + isPrimeNumber(563));

        System.out.print("Is number 7 is prime : " + isPrimeOptimised(7));
        System.out.print("Is number 7 is prime : " + isPrimeOptimised(173));
        System.out.print("Is number 7 is prime : " + isPrimeOptimised(563));

    }

    /*  Brute Force Approach:
        Iterate through 1 to N and count number of factors. if factors are equals to 2 then its prime.
        Time Complexity  : O(N)
        Space Complexity : O(1)
     */
    public static boolean isPrimeNumber(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    /*
        The factors for a number always appears in pairs(i, N/i). So we don't have to check all the factors.
        If i is a factor of N then N/i is also a factor. So we can loop from 1 to Sqrt(N) to check if it's a prime or not.

        Time  Complexity : O(Sqrt(N))
        Space Complexity : O(1)
     */
    public static boolean isPrimeOptimised(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                // if N is a perfect square like 36 then (6, 36/6)=> (6,6) is a pair but we want to consider 6 only once. so this case will handle perfect square scenario.
                if (i == N / i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count == 2;
    }
}