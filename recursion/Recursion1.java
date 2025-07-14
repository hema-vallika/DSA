public class Recursion1 {
    public static void printDescent(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n + " ");

        printDescent(n-1);

    }

    public static void printInc(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static int sumOfNno(int n){
      
        if(n==0){
            return 0;
        }
        return n + sumOfNno(n-1);
    }

    public static int fibbonacci(int n){
        if( n==0 || n == 1){
            return n;
        }
        return fibbonacci(n-1) + fibbonacci(n-2);
    }

    public static boolean isSorted(int [] arr , int i){
        if(i == arr.length -1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcurance(int arr [],int key,int i){
            if(arr.length == i){
                return 0;
            }
            if(arr[i] == key){
                return i;
            }
            return firstOcurance(arr, key, i+1);
        }

    public static int lastOccurance(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, key, i+1);
        if(isFound != -1){
            return isFound;
        }
        //check with self
        if(arr[i] == key){
            return i;
        }
        return isFound;
    }    


    public static void main(String[] args) {
        // printDescent(5);
        // printInc(5);
        // System.out.println(factorial(5));
        // System.out.println(sumOfNno(5));
        // System.out.println(fibbonacci(8));
        //0 1 1 2 3 5 8 13 21
        int arr [] = {1,5,2,5,3,4};
        // System.out.println(isSorted(arr, 0));
        System.out.println(firstOcurance(arr, 5, 0));
        
    }
    
}
