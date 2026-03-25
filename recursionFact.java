import java.util.*;
public class recursionFact {
    public static void Fact(int i,int n , int Fact) {
if (i==n) {
    return;
}
        Fact=Fact*(i+1);
        Fact(i+1, n, Fact);
        System.out.println(Fact);
        
    }
    public static void main(String[] args) {
       Fact(0, 5, 1);
    }
}