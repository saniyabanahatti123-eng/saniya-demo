// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.*;
public class index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int size =sc.nextInt();
        sc.close();
        int numbers[] = new int [size];
        for (int i= 0; i < size; i++) {
            numbers[i]=sc.nextInt();
        } 
        for (int i = 0; i < size; i++) {
            System.out.println(numbers [i]);
        }
    }
}

        