package com.endava.main;

import com.endava.enums.CarBrands;
import com.endava.util.ArrayProcesser;

/**
 * Created by sbogdanschi on 22/03/2017.
 */
public class Main {
    public static void main(String[] args) {
        CarBrands carBrands = CarBrands.FERRARI;
        System.out.println("this." + carBrands);
        System.out.println("next." + carBrands.next());
        System.out.println("previous." + carBrands.previous());
        carBrands.showAll();

        int[] array = {5, 3, 2, 1, 6, 7, 6, 3, 1, 2, 8};
        int[] array2 = {3, 5, 6, 7, 4};
        ArrayProcesser arrayProcesser = new ArrayProcesser();

        System.out.println("-----------------Task 1-------------------");
        System.out.println(arrayProcesser.checkIfNotContainsOneOrFour(array));
        System.out.println(arrayProcesser.checkIfNotContainsOneOrFour(array2));

        System.out.println("-----------------Task 2-------------------");
        System.out.println(arrayProcesser.checkIfContainsOneOrTwoAfterFirstOccurenceOfOne(array));
        System.out.println(arrayProcesser.checkIfContainsOneOrTwoAfterFirstOccurenceOfOne(array2));

        System.out.println("-----------------Task 3-------------------");
        System.out.println(arrayProcesser.checkAmountOfEvenNumbers(array));
        System.out.println(arrayProcesser.checkAmountOfEvenNumbers(array2));
    }
}
