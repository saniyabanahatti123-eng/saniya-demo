import java .util.*;
public class backtracking {
    public static  void PrintPerm(String str,String perm,int idx) {
if (str.length()==0) {
  System.out.println(perm); 
  return; 
}

for (int i= 0; i < str.length(); i++) {
    char currstr = str.charAt(i);
    String newstr = str.substring(0,i) + str.substring(i+1);
    PrintPerm(newstr,perm+currstr,idx+1);
}
    }
    public static void main(String[] args) {
        String str = "ABC";
    PrintPerm(str,"",0);
    }
}
