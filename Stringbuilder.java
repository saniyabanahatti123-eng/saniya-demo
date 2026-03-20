// Source code is decompiled from a .class file using FernFlower decompiler (from Ii
import java.util.Scanner;
public class Stringbuilder {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("tony");
       System.out.println (sb);
       System.out.println(sb.charAt(3));
       //setcharAt at index 2
       sb.setCharAt(2, 'h');
       System.out.println(sb);
       // string insert at 0 index
       sb.insert(0 , 'm');
       System.out.println(sb);
       sb.delete(2,3);
       System.out.println(sb);
       //append
       sb.append("h");
       System.out.println(sb);
       //length
       System.out.println(sb.length());
    }
}





 
