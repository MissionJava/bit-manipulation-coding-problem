package com.bit.manipulation.problems;

/* Check if N is power of 2 or not?
*  2 -> 2^1, 4 -> 2^2, 8 -> 2^3 are power of 2
*  5, 6, 7, 9, 10, 11 ... 15 are not power of two
* */
public class NumberIsPowerOfTwo {

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowerOfTwoUsingBitwiseAND(6));
        System.out.println(isPowerOfTwoUsingBitwiseAND(8));
        System.out.println(isPowerOfTwoUsingBitwiseAND(10));
        System.out.println(isPowerOfTwoUsingBitwiseAND(13));
        System.out.println(isPowerOfTwoUsingBitwiseAND(16));
        System.out.println(isPowerOfTwoUsingBitwiseAND(20));
    }

    //Simple solution to this problem is to repeated divide N by 2 if N is even
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }

        while (n % 2 == 0) {  //TC: O(log2N)
            n /= 2;
        }
        return n == 1;
    }

    /*
        Properties for numbers which are powers of 2, is that they have one and only one bit set
        in their binary representation. If the number is neither zero nor a power of two, it will
        have 1 in more than one place. So if x is a power of 2 then x & (x-1) will be 0.
    * */
    public static boolean isPowerOfTwoUsingBitwiseAND(int n) {
        if (n == 0)
            return false;
        return  ((n & n-1) == 0);
    }
}
