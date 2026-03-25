import java.util.*;
public  class StackHeight {
    public static int CalcPower(int x, int n) {
if (n==0) { //basecase1
    return 1;
}
if (x==0) { //basecase2
    return 0;
}
        int xpower1 = CalcPower( x,n-1);
        int xpower2 = x*xpower1;
        return xpower2;
    }
    public static void main(String args[]) {
        int x=2,n=5;
        int ans = CalcPower(x,n);
        System.out.println(ans);
    }
        
    }



    

