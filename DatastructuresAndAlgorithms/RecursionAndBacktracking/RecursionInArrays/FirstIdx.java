package recursionInArrays;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int find = scn.nextInt();
        int max = firstIdx(arr, 0, find);
        System.out.println(max);
    }

    public static int firstIdx(int[] arr, int idx, int find) {
        if (idx == arr.length) {
            return -1;
        } else if (arr[idx] == find) {
            return idx;
        }
        
        return firstIdx(arr, idx + 1, find);


    }

}