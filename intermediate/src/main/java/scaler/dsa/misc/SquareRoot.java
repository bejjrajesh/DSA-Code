package scaler.dsa.misc;

/*  Given a perfect square number >=1, find its square root.  */
class SquareRoot {

    public static void main(String[] args) {
        System.out.println("Square Root of 36 = "+ squareRoot(36));
        System.out.println("Square Root of 36 = "+ squareRootOptimised(36));

        System.out.println("Square Root of 169 = "+ squareRoot(169));
        System.out.println("Square Root of 169 = "+ squareRootOptimised(169));
    }

    /*
        Brute Force Approach: Iterate from 1 to N and see if the square of variable is equals to N.
        Time Complexity: O(Sqrt(N)) Because loop will return when square root is found.
        Space Complexity: O(1)
     */
    public static long squareRoot(long N) {
        for (long i = 2; i <= N; i++) {
            if (i * i == N) return i;
        }
        return -1;
    }

    /*
        This approach uses binary search technique on the answer space.
        Will divide the answer space  into two half in each iteration and in each iteration will check if the square
        Time Complexity  : O(longN)
        Space Complexity : O(1)
     */
    public static long squareRootOptimised(long N) {
        long start =1, end = N;
        while(start <=end){
            long mid = (start + end)/2;
            long sqrt = mid * mid;
            if(sqrt == N){
                return mid;
            }else if(sqrt < N){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}