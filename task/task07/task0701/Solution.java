package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] list = new int [20];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < list.length; i++){
            list[i] = Integer.parseInt(input.readLine());
        }
        return list;
    }

    public static int max(int[] array) {
        int max = array[0];
        for(int j = 1; j < array.length; j++){
            if(array[j] > max){
                max = array[j];
            }
        }
        return max;
    }
}
