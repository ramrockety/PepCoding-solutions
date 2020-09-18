package recursionInArrays;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int max = maxOfArr(arr,0);
        System.out.println(max);
    }

    public static int maxOfArr(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
       
        int max = maxOfArr(arr,idx+1);
        if(arr[idx] > max){
            max = arr[idx];
        }
        return max;
    }

}
