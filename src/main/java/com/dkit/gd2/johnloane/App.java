package com.dkit.gd2.johnloane;

/**
 * GD2 Primitive Types
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int myValue = 10000;

        System.out.println(myValue);

        playWithInts();

        playWithBytes();

        playWithLong();

        playWithFloat();

        playWithDouble();

        convertPoundsToKilos(100);

        playWithChar();

        playWithBool();

        niteClubEntry(20);

    }

    private static void niteClubEntry(int age)
    {
        boolean canEnter = false;
        int ENTRY_AGE = 21;

        if(age >= ENTRY_AGE)
        {
            canEnter = true;
        }
        System.out.println(canEnter);
    }

    private static void playWithBool()
    {
        boolean fortNiteIsMyFavourite = false;
        boolean mineCraftIsMyFavoutite = true;
        System.out.println(fortNiteIsMyFavourite);
    }

    private static void playWithChar()
    {
        char myChar = 'D';
        char myUnicodeChar = '\u263A';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
    }

    private static void convertPoundsToKilos(double weightInPounds)
    {
        double LBS_TO_KG_RATIO = 0.45359237;
        double weightInKilos = weightInPounds * LBS_TO_KG_RATIO;
        System.out.printf("%.1f pounds is %.1f kilos", weightInPounds, weightInKilos);
        System.out.println();
    }

    private static void playWithFloat()
    {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println(myMinFloatValue);
        System.out.println(myMaxFloatValue);
    }

    private static void playWithDouble()
    {
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println(myMinDoubleValue);
        System.out.println(myMaxDoubleValue);
    }

    private static void playWithLong()
    {
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        long formattedLong = 2_123_123_123_123L;
        System.out.println(formattedLong);
    }

    private static void playWithBytes()
    {
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
    }

    private static void playWithInts()
    {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Min int value is: " + myMinIntValue);
        System.out.println("Max int value is: " + myMaxIntValue);

        System.out.println(myMaxIntValue+1);
        System.out.println(myMinIntValue-1);

        int tooBig = 2147483647;
    }
}
