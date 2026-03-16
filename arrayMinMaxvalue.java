// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class arrayMinMaxvalue {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); 
    int Size = sc.nextInt();
    int numbers[] = new int[Size];

for(int i=0; i<Size; i++) {
    numbers[i] = sc.nextInt();
}
int max = Integer.MIN_VALUE;
int min = Integer.MAX_VALUE;
for(int i=0; i<Size; i++) {
    if (numbers[i] < min) {
        min = numbers[i];
    }

     if (numbers[i] > max) {
        max = numbers[i];
     }
    }
    
    

     System.out.println("largest number: " + max);
System.out.println("smallest number: "  + min);
}
}






