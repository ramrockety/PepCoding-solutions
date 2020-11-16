import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here
  Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int inverted = 0;
  int position = 1;
  while(n > 0){
      int dig = n % 10;
      n /= 10;
      inverted += position * Math.pow(10,dig-1);
      position++;
  }
  System.out.println(inverted);
 }
}