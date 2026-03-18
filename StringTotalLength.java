// Source code is decompiled from a .class file using FernFlower decompiler (from Inte
import java.util.*;
public class StringTotalLength {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    String[] array = new String[size];
    int totLength = 0;
    for (int i = 0; i < array.length; i++) {
        array[i] = sc.nextLine();
        totLength +=array[i] . length();
    }
    System.out.println(totLength);
    
}

}



