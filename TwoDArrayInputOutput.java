// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA)
import java .util.Scanner;

public class TwoDArrayInputOutput {
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
for(int i=0; i<row; i++) {
    for(int j=0; j<colus; j++) {
        System.out.print(numbers[i][j] + " ");
    }
    System.out.println();
}

}
}







