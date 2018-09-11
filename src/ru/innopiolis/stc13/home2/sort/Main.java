package ru.innopiolis.stc13.home2.sort;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Integer[] array = new Integer[25];
        int low = 0;
        //int high = 24;
        int high = array.length-1;

        for (int i = 0; i < array.length; i++){
            array[i]=(int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(array));

        QuickSort quickSort = new QuickSort();
        long dateStart = new Date().getTime();
        quickSort.quicksort(array, low, high);
        //Arrays.sort(array);
        long dateEnd = new Date().getTime();

        System.out.println(Arrays.toString(array));
        System.out.println("Sort time: " + (dateEnd - dateStart) + " millisecond");
    }
}
