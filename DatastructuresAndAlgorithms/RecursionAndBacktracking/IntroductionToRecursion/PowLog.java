package recursion;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powLog(x,n));
    }

    public static int powLog(int x,int n){
        if(n == 0){
            return 1;
            
        }else if(n % 2 == 0){ 
            return powLog(x,n/2) * powLog(x,n/2);
            
        }else{  
            return x * powLog(x,n/2) * powLog(x,n/2);
            
        }
        
        
        
            
            
        
    }

}
