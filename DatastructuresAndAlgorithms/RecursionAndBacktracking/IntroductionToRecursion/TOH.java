package recursion;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int id1 = scn.nextInt();
        int id2 = scn.nextInt();
        int id3 = scn.nextInt();
        toh(n,id1,id2,id3);
        
        
        
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n <= 0){
            return;
        }
        toh(n-1,t1id,t3id,t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1,t3id,t2id,t1id);
        
        
    }

}
