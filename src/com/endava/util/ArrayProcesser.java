package com.endava.util;

/**
 * Created by sbogdanschi on 22/03/2017.
 */
public class ArrayProcesser {

    public boolean checkFirstTask(int[] array){
        int check = 0;
        for(int i = 0; i < array.length; i++) {
            if (array[i] != 1 && array[i] != 4) {
            } else check++;
        }
        if(check == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkSecondTask(int[] array){
        int local = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 1){
                local = i + 1;
            }
        }
        for(int i = local; i < array.length; i++){
            if(array[i] == 1 || array[i] == 2){
                return true;
            } else return false;
        }
        return false;
    }

    public int checkThirdTask(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
