package com.bit.manipulation.problems;

public class CountBitSet {

    public static void main(String[] args) {

        System.out.println("Bit set counts in number: " + countBitSets(16) + " in binary representation " + Integer.toBinaryString(16));
        System.out.println("Bit set counts in number: " + countBitSets(15) + " in binary representation " + Integer.toBinaryString(15));
        System.out.println("Bit set counts in number: " + countBitSets(14) + " in binary representation " + Integer.toBinaryString(14));
        System.out.println("Bit set counts in number: " + countBitSets(13) + " in binary representation " + Integer.toBinaryString(13));
        System.out.println("Bit set counts in number: " + countBitSets(12) + " in binary representation " + Integer.toBinaryString(12));
        System.out.println("Bit set counts in number: " + countBitSets(11) + " in binary representation " + Integer.toBinaryString(11));
        System.out.println("Bit set counts in number: " + countBitSets(10) + " in binary representation " + Integer.toBinaryString(10));
        System.out.println("Bit set counts in number: " + countBitSets(9) + " in binary representation " + Integer.toBinaryString(9));
        System.out.println("Bit set counts in number: " + countBitSets(8) + " in binary representation " + Integer.toBinaryString(8));
    }

    // number & (number -1 )  results in number -1 if number is not power of 2 i.e. 2^n else zero
    public static int countBitSets(int number) {
        if (number == 0 )
            return 0;
        return 1 + countBitSets(number & (number -1));
    }
}
