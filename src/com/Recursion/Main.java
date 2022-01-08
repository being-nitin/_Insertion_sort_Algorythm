package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// Insertion sort Algorithm:
        int[] arr = {8,6,4,2,7};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        for(int i=0 ;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
