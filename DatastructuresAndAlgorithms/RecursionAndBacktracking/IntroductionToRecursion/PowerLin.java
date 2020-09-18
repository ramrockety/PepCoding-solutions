package recursion;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powLin(x,n));
    }

    public static int powLin(int x,int n){
        if(n == 0) return 1;
        
        return x * powLin(x,n-1);
    }

}
