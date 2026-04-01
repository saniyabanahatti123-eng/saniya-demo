public class qickSort {
    public static int partitian(int arr[],int low,int high) {
        int pivot=arr[high]; // pivot last element
        int i =low-1;
        
        for (int j = low; j<high; j++) {
            if (arr[j]<pivot) {
                i++; //proviide empty place
                //swap 
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap For pivote element to set in right position
        i++;
        int temp=arr[i];
        arr[i]=arr[high]; 
        arr[high] = temp;
        return i;  

    }
    public  static void quickSort ( int arr[],int low,int high){
if (low<high) {
    int pidx=partitian(arr,low,high); //pivote position

    quickSort(arr, low,pidx-1);// LeFt unsorted element
    quickSort(arr, pidx+1, high); // Right sorted element 
}
    }
    public static void main(String args[]) {
        int arr[] ={6,3,9,5,2,8};
        int n = arr.length;

        quickSort(arr, 0, n-1); //Function call
        
        //print
        for (int i=0; i<n; i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
}