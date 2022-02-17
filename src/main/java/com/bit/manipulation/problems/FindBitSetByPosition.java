package com.bit.manipulation.problems;

/*
* Check if the ith bit is set or not (1 or not), we can use AND operator
* Approach:
* Let’s say we have a number N, and to check whether it’s ith bit is set or not, we can AND it with the number 2^i .
* The binary form of 2^i contains only ith bit as set (or 1), else every bit is 0 there. When we will AND it with N,
* and if the ith bit of N is set, then it will return a non-zero number (2^i to be specific), else 0 will be returned.

Using Left shift operator, we can write 2^i as 1 << i
*
*   N = 4, i = 1
*   1 << 1  --> 2^1 = 2 --> 0010  (0001 left shifted to 0010)
*   0100 & 0010 = 0000  --> ith bit is 0
*   n & 1 << 1 == 0  --> ith bit i.e. bit at position 1 from right is zero
*
*    N = 4, i = 2
*   1 << 2  --> 2^2 = 4 --> 0100 (0001 left shifted by 2 to 0100)
*   0100 & 0010 = 0000  --> ith bit is 0
*   n & 1 << 1 == 0  --> ith bit i.e. bit at position 1 from right is zero
* */
public class FindBitSetByPosition {

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(4) + " at i = 0: " + findBitSetAt(4, 0));
        System.out.println(Integer.toBinaryString(4) + " at i = 1: " + findBitSetAt(4, 1));
        System.out.println(Integer.toBinaryString(4) + " at i = 2: " + findBitSetAt(4, 2));
        System.out.println(Integer.toBinaryString(4) + " at i = 3: " + findBitSetAt(4, 3));
        System.out.println(Integer.toBinaryString(16) + " at i = 2: " + findBitSetAt(16, 2));
        System.out.println(Integer.toBinaryString(16) + " at i = 4: " + findBitSetAt(16, 4));
        System.out.println(Integer.toBinaryString(15) + " at i = 0: " + findBitSetAt(15, 0));
        System.out.println(Integer.toBinaryString(15) + " at i = 1: " + findBitSetAt(15, 1));
        System.out.println(Integer.toBinaryString(15) + " at i = 2: " + findBitSetAt(15, 2));
        System.out.println(Integer.toBinaryString(15) + " at i = 3: " + findBitSetAt(15, 3));
        System.out.println(Integer.toBinaryString(15) + " at i = 4: " + findBitSetAt(15, 4));
    }

    public static boolean findBitSetAt(int n, int i) {
        return (n & (1 << i)) !=  0 ? true : false;
    }
}
