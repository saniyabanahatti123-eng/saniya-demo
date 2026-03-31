import java .util.*;
public class mergeSort {
    public static void conqure(int arr[] ,int si,int mid,int ei) {//For conqure
        int merged[] = new int[ei-si+1];//merged array
        int idx1 = si;//LeFt array part
        int idx2 =mid+1;//Right array part
        int x=0;
        while(idx1<=mid && idx2<=ei) {
            if (arr[idx1]<=arr[idx2]) {
                merged[x++]=arr[idx1++];
            }
            else {
                 merged[x++]=arr[idx2++];
            }
        }
//remaining LeFT part
while(idx1<=mid) { //copy sorted element 
 merged[x++]=arr[idx1++];
}
//remaining Right part
  while(idx2<=ei){ //copy sorted element
merged[x++]=arr[idx2++];
  }
  for (int i=0,j=si; i<merged.length; i++,j++) { //copy the array element
    arr[j]=merged[i]; //merged arry become arr[j]
  }
    }
    public static void divide(int arr[] ,int si,int ei) {//For divide
if (si>=ei) {
    return;
}
int mid = si+(ei-si)/2;
divide(arr,si,mid);
divide(arr,mid+1,ei);
conqure(arr,si,mid,ei);
    }
public static void main(String[] args) {
    int arr[] = {4,7,2,6};
    int n =arr.length;

    divide(arr, 0,n-1);
    //print
    for (int i=0; i<n; i++) {
        System.out.print(arr[i]+"");
    }
    System.out.println();
}
}


















