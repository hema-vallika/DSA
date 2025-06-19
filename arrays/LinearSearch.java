public class LinearSearch {
    public static int linearSearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i; // return the index if key is found
            }
        }
        return -1; // return -1 if key is not found
    }

    public static int largest(int nums[]){
        int max = Integer.MIN_VALUE; // Initialize max to the smallest possible integer
        int min = Integer.MAX_VALUE; // Initialize min to the largest possible integer
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i]; // Update max if a larger number is found
            }
            if(nums[i]< min){
                min = nums[i]; // Update min if a smaller number is found
            }
        }
        System.out.println("smallest number in the array: " + min);
        return max; // Return the largest number found
    }

    public static int binarySearch(int nums[],int key){
        int st=0;
        int end = nums.length - 1;
        while(st<=end){
            int mid = st+end / 2;
             // Calculate the middle index
             if(nums[mid] == key){
                return mid; // Return the index if key is found
             }
             else if(nums[mid]> key){ //go to left
                end = mid - 1;

             }
             else{//go to right
                st = mid +1;
             }
        }
        return -1; // Return -1 if key is not found
    }

    public static void reverse(int nums[]){
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            // swap
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        // System.out.println("Reversed array: " + java.util.Arrays.toString(nums));
    }

    public static void pairs(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
            }
            System.out.println();
        }
    }


    public static void printSubArray(int nums []){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                for(int k=i;k<=j;k++){//sirf print karrwana
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        int key = 4;
       
        // largest number in the array
        // int largestNum = largest(nums);
        // System.out.println("Largest number in the array: " + largestNum );

        // binary search
        // int index = binarySearch(nums, key);
        // if (index != -1) {
        //     System.out.println("Key " + key + " found at index: " + index);
        // } else {
        //     System.out.println("Key " + key + " not found in the array.");
        // }

        //reverse the array
        // reverse(nums);
        // for(int i=0;i<nums.length;i++){
        //     System.out.print(nums[i] + " ");
        // }

        //pairs in the array
        // pairs(nums);

        // print subarrays
        printSubArray(nums);

    }
}
