// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

import java.util.HashSet;

public class ArrQu {
    public static boolean containDuplicate(int nums []){//o(n^2)
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean containsDuplicateOptimize(int nums []){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;

    }


    public static void main(String [] args){
        int nums [] = {1,2,3,1};
        // System.out.println(containDuplicate(nums));
        System.out.println(containsDuplicateOptimize(nums));

    }
}