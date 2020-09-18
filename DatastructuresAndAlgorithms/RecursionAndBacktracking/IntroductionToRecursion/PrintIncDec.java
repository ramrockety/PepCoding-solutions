package recursion;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncDecr(n);
    }

    public static void printIncDecr(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        printIncDecr(n-1);
        System.out.println(n);
                
    }

}
