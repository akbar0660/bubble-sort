package org.example;

import java.util.Arrays;

public class BubbleSortt {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,6,7,4,5,8,1,2,5};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
