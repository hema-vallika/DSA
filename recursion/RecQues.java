// 

import java.util.HashSet;

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

    //first and last occurance of an element in string
    public static int first = -1;
    public static int last = -1;
    public static void firstAndLastOccurance(String str,char key,int idx){
        //base case
        if(idx == str.length()){
            System.out.println("First Occurance: " + first);
            System.out.println("Last Occurance: " + last);
            return;
        }

        //kaam
        if(str.charAt(idx) == key){
            if(first == -1){
                first = idx;
            }
            last = idx;
        }
        firstAndLastOccurance(str, key, idx + 1);


    }


    //check if an array is sorted
    public static boolean isSorted(int arr [],int idx){
        //base case
        if(idx == arr.length -1 ){
            return true;
        }
        //kaam
        if(arr[idx]>arr[idx +1]){
            return false;
        }
        return isSorted(arr, idx + 1);
    }

    //move all x to the end of the string
    public static int count = 0;
    public static String moveAllX(String str,int idx,StringBuilder newStr){

        //base case
        if(idx == str.length()){
            for(int i=0;i<count;i++){
                newStr.append('x');
            }
            return newStr.toString();
        }
      
        //kaam
        if(str.charAt(idx) == 'x'){
            count++;
            return moveAllX(str, idx + 1, newStr);
        }
        newStr.append(str.charAt(idx));
        return moveAllX(str, idx + 1, newStr);
    }

    public static boolean [] map= new boolean[26];
    //remove duplicates from a string
    public static void removeDuplicates(String str, int idx, StringBuilder newStr) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr.toString());
            return;
        }

        // kaam
        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a'] == true) {
            // character already exists, skip it
            removeDuplicates(str, idx + 1, newStr);
        } else {
            // character does not exist, add it to the new string
            map[currentChar - 'a'] = true;
            newStr.append(currentChar);
            removeDuplicates(str, idx + 1, newStr);
        }
    }
    
    
    //print all subsequences of a string in same order
    public static void printSubsequences(String str, int idx, String newStr) {
        // base case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        // include the current character
        printSubsequences(str, idx + 1, newStr + str.charAt(idx));
        // exclude the current character
        printSubsequences(str, idx + 1, newStr);
    }


    //print all unique subsequences of a string in same order
     public static void printUniqueSubsequences(String str, int idx, String newStr,HashSet<String> set) {
            // base case
        if (idx == str.length()) {
            if(set.contains(newStr)) {
                return; // skip if this subsequence is already printed
            }else{
                System.out.println(newStr);
                set.add(newStr); // add to the set to avoid duplicates
                return;
            }
        }

        // kaam
        // include the current character
        printUniqueSubsequences(str, idx + 1, newStr + str.charAt(idx),set);
        // exclude the current character
        printUniqueSubsequences(str, idx + 1, newStr,set);
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
        // firstAndLastOccurance("absscdaefgah", 'a', 0);
        // int arr [] = {1,2,9,4,5,6,7,8,9};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(moveAllX("axbcxxd", 0, new StringBuilder()));
    //    removeDuplicates("absscdaefgah", 0, new StringBuilder());
        // String str = "aaa";
        // System.out.println("Subsequences of " + str + ":");
        // printSubsequences(str, 0, "");

        // HashSet <String> set = new HashSet<>();
        // System.out.println("Unique Subsequences of " + str + ":");
        // printUniqueSubsequences(str, 0, "", set);
    }
}