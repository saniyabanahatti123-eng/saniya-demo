// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA)
import java .util.*;

public class checkArrayAssending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int[] numbers = new int[Size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAssending = false;
        for (int i= 0; i < Size-1; i++) {
            if (numbers[i]<numbers[i]+1) {
                 isAssending = true;
                break;
            }
        }
            if (isAssending) {
               System.out.println("array is assending");
            } 
            
            else {
                System.out.println("number is not assending");
            }
        }
    }







