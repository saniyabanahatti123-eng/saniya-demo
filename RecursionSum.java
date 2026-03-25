import java .util.*;
public class RecursionSum {
public static void sum (int i,int sum,int n) {
  if (i==n) {
    sum+=i;
    System.out.println(sum);
    return;
  }
    sum=sum+i;
sum(i+1, sum, n);
}
public static void main(String[] args) {
    sum(1, 0, 5);
}
}