package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 1000;

	    int myMinValue = Integer.MIN_VALUE;
	    int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinValue);
        System.out.println("Integer Maximum Value = " + myMaxValue);
        System.out.println("Busted MAX Value = " + (myMaxValue + 1));
        System.out.println("Busted MIN Value = " + (myMinValue - 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483648L;
        System.out.println((bigLongLiteralValue));

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        byte test1 = 20;

        short test2 = 200;

        int test3 = 2000;

        long test4 = 50000L + 10L * (test1 + test2 + test3);

        System.out.println("test");
        System.out.println(test4);

    }
}
