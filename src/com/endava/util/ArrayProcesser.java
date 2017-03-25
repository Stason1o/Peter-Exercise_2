package com.endava.util;

/**
 * Created by sbogdanschi on 22/03/2017.
 */
public class ArrayProcesser {

    public boolean checkIfNotContainsOneOrFour(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfContainsOneOrTwoAfterFirstOccurenceOfOne(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == 1 || array[j] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int checkAmountOfEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
