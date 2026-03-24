import java.util.*;
public class RecursionFact {
    public static int printFact(int n) {
         if (n==1) {
           return 1; 
         }
         int Factorial =printFact(n-1);
         int Factorial2 = Factorial*n;
         return Factorial2;
    }
    public static void main(String[] args) {
        int n = 5;
     int ans =   printFact(n);
     System.out.println(ans);
        
    }

}


    

