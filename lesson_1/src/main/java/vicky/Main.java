package vicky;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        if (i == 0) {
            return;
        }
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        int n = 0;
        n = findSignBit(i, n);
        System.out.println(n);
        int evenPosition = 0;
        int maxValue = Short.MAX_VALUE;

        int oddPosition = maxValue - 1 - i;
        int[] array = new int[maxValue - i];
        for (int j = i; j < maxValue; j++) {
            if (j % n == 0) {
                array[evenPosition] = j;
                evenPosition++;
            } else {
                array[oddPosition] = j;
                oddPosition--;
            }
        }
        int[] m1 = Arrays.copyOfRange(array, 0, evenPosition);
        int[] m2 = Arrays.copyOfRange(array, evenPosition, array.length);
        reverseArray(m2);
        System.out.println(m2);
    }


    private static int findSignBit(int i, int n) {
        int k = 2;
        while (k < i) {
            k = k * 2;
            n += 1;
        }
        return n;
    }

    private static void reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int currentValue = 0;
        while (i <= j) {
            currentValue = array[j];
            array[j] = array[i];
            array[i] = currentValue;
            i++;
            j--;
        }
    }
}