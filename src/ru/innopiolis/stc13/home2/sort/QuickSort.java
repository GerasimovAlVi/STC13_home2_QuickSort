package ru.innopiolis.stc13.home2.sort;

public class QuickSort {
    public static void quicksort(Integer[] array, int low, int high){
        try {
            if ((array.length == 0) || (low >= high)) {
                return;
            }

            int oporElement = array[(high - low) / 2 + low];
            int i = low;
            int j = high;
            while (i <= j) {
                while (array[i] < oporElement) {
                    i++;
                }
                while (array[j] > oporElement) {
                    j--;
                }
                if (i <= j) {
                    int prom = array[i];
                    array[i] = array[j];
                    array[j] = prom;
                    i++;
                    j--;
                }
            }

            if (low < j) {
                quicksort(array, low, j);
            }
            if (high > i) {
                quicksort(array, i, high);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds");
        }
    }
}
