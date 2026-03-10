import java.util.*;

public class demo {
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        else {
            return gcd (b, a % b);
        }
    }
    public static void main(String[] args) {
        int result = gcd(36,25);
        System.out.println("gcd  both number:"+result);
        
    }
}