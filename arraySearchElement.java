// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class arraySearchElement {
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int number[] = new int[size];
for (int i = 0; i<size; i++) {
    number[i]= sc. nextInt();
}
int x = sc.nextInt();
for (int i=0; i<number.length; i++) {
     if (number[i]==x) {
        System.out.println("x Found at index i=" +i);
     }
     sc.close();
}
    }
    }
