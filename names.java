// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA)
import java .util.Scanner;
public class names {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int Size = sc.nextInt();
        String[] names = new String[Size];
        for (int i = 0; i< names.length; i++) {
          names[i] = sc.nextLine(); 
        }
        for (int  i= 0; i < names.length; i++) {
           System.out.println("names are:" +names[i]);
        }
    }
}






