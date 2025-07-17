// 

public class RecQues{
   static String digits [] = {"zero","one","two","three","four","five","six","seven","eight","nine"};


    public static void allOccurances(int arr [],int key,int idx){
        //base case
        if(idx == arr.length){
            return;
        }

        //kaam
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }
        allOccurances(arr, key, idx + 1);
    }

    public static void printDigits(int n){
        //base case
        if(n == 0){
            return;

        }
        //kaam
        int lastDigit = n % 10;
        printDigits(n/10);
        System.out.print(digits[lastDigit]+ " ");
    }


    //length of a string using recursion
    public static int length(String str){
        //base case
        if(str.length() == 0){
            return 0;
        }
        //kaam
        return 1+ length(str.substring(1));
    }


    //Tower of Hanoi
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        //base case
        if(n == 1){
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }
        //kaam
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    //print a string in reverse
    public static void reverseString(String str,int idx){
        //base case
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        //kaam
        System.out.print(str.charAt(idx));
        reverseString(str, idx - 1);
    }





    public static void main(String[] args) {
        // int arr [] = { 3,2,4,5,6,2,7,2,2};
        // int key = 2;
        // allOccurances(arr, key, 0);
        // printDigits(2019);
        // System.out.println(length("hello"));
        // System.out.println("Tower of Hanoi");
        // towerOfHanoi(3, "S ", "H", "D");
        // String str = "hello";
        // reverseString(str, str.length() - 1);

    }
}