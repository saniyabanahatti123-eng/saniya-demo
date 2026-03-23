import java.util.*;
public class SelectionSort {
public static void main(String args[]) {
int arr[]={4,7,3,1};
for (int i=0; i<arr.length-1; i++) {
    int Smallest = i;
    for (int j= i+1; j<arr.length; j++) {
        if (arr[Smallest]>arr[j]) {
             Smallest = j;
        }
    }
    int temp = arr[Smallest];
    arr[Smallest] = arr[i];
    arr[i] = temp;
}

for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);

}
}
}


    
    
       