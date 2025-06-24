import java.util.*;

public class BasicSorting {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int count =0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
            if(count==0){
                break;
            }
        }
    }




    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {//last ko compare jaruri nhi hein isiliye n-2 tak or < n-1
            int minIndex = i; //i tak sorted hein
            for (int j = i + 1; j < n; j++) { //i+1 se n-1 tak unsorted hein usse compare karna hein
                if (arr[j] < arr[minIndex]) { //iske andar swap karna hin nhi agar swap karenge toh bubble sort ban jayega humko inner loop mein swap nhi krna 
                                               //hein loop ke bahar swap karenge
                                               //yaha if mein > rakhoge toh decreasing order ban jayega
                    minIndex = j;
                }
            }
            //swap i and minIndex
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }


    public static void insertionSort(int[] arr) {//o(n^2)
        int n = arr.length;
        for (int i = 1; i < n; i++) {
         int curr = i;
         int prev = i-1;
         //finding out the correct pos to insert
         while(prev>=0 && arr[prev]>arr[curr]){
            arr[prev+1] = arr[prev];
            prev--;
         }
         //insertion
         arr[prev+1] = arr[curr];
        }
    }

    //inbuilt sort
    public static void inBuiltSort(int[] arr){
        Arrays.sort(arr);
    }

    public static void countingSort(int arr []){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];//including 0
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }




    public static void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 32,33,56,76,11,98};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // inBuiltSort(arr);
        // Arrays.sort(arr,2,6);
        countingSort(arr);
        printArr(arr);
        
    }
    
}
