package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] list = new String[10];
        int[] nums = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < list.length; i++){
            list[i] = br.readLine();
            nums[i] = list[i].length();
        }
        for(int j = 0; j < nums.length; j++)
        System.out.println(nums[j]);
    }
}
