package com.suraj.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        bubbleSort();
    }

    public static void bubbleSort(){
        int[] num = {45, 31, 27, 55, 38};
        System.out.println("Before "+ Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if(num[i] < num[j]) {
                    swap(num, i, j);
                }
            }
        }
        System.out.println("After "+ Arrays.toString(num));
    }

    public static void swap(int[] arr, int i, int j){
        if(arr[i] == arr[j]) return;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

}
