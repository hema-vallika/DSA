import java.util.*;
public class MaxSubArray {
    public static void MaxSumSubArray(int nums []){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                currSum =0;
                for(int k=i;k<=j;k++){
                    //sub array sum
                    currSum += nums[k];
                    
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max subarray sum: "+maxSum);

    }

    public static void MaxSumSubArrayOptimized(int nums []){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix [] = new int [nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        
        for(int i=0;i<nums.length;i++){//start
            for(int j=i;j<nums.length;j++){//end
                currSum = 0;
               currSum = (i == 0)? prefix[j] : prefix[j] - prefix[i-1]; // calculate the sum using prefix array
                // sub array sum
              
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        
        System.out.println("max subarray sum: "+maxSum);
    }

    // Kadane's Algorithm
    public static void kadensAlgorithm(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            if(currSum < 0){
                currSum = 0; // reset current sum if it goes negative
            }
            maxSum = Math.max(maxSum, currSum); // update max sum
        }
        System.out.println("Max subarray sum using Kadane's Algorithm: " + maxSum);
    }


    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        // MaxSumSubArray(numbers); //o(n^3)

        //MaxSumSubArrayOptimized(numbers);// o(n^2)

        kadensAlgorithm(numbers); // O(n)
        
    }

    
}
