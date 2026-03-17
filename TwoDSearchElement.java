// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA)
import java .util.Scanner;

public class TwoDSearchElement {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int row= sc.nextInt();
int colus = sc.nextInt();
int[][] numbers = new int[row] [colus];
for(int i=0; i<row; i++) {
    for(int j=0; j<colus; j++) {
        numbers[i][j] = sc.nextInt();
    }
} 
int x = sc. nextInt();
for(int i=0; i<row; i++) {
    for(int j=0; j<colus; j++) {
        if (numbers[i][j]==x) {
           System.out.println("x ound at location ("+ i +" , " + j +")"); 
        }
    }
}

}

}








