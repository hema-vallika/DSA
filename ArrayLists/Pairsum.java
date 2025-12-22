package ArrayLists;
import java.util.ArrayList;


public class Pairsum {

    //sorted arraylist pair sum to target
    //Broute Force Approach

    // public static boolean pairSumBrouteForce(ArrayList<Integer> list,int target){
    // for(int i = 0 ; i<list.size();i++){
    //     for(int j = i+1;j<list.size();j++){
    //         if(list.get(i) + list.get(j) == target){
    //             return true;
    //         }
    //     }  
    // }
    // return false;
    // }


    //Optimized Approach (2-pointer approach)

    // public static boolean pairSumOptimize(ArrayList<Integer> list,int target){
    //     int lp = 0;
    //     int rp = list.size() - 1;
    //     while(lp < rp){
    //         if(list.get(lp) + list.get(rp) == target){
    //             return true;
    //         }
    //         if(list.get(lp) + list.get(rp) < target){
    //             lp++;
    //         }else{
    //             rp--;
    //         }
    //     }
    //     return false;
    // }


    //  pair sum-2

    //sorted and rotated arraylist pair sum to target
    //Broute Force Approach -> same , find all possible pair sum and check with target o(n^2)

    //Optimized Approach (2-pointer approach)
    //find pivot point -> the point where sorted array is breaked, condition breaks list[i] < list[i+1] in a sorted array 
    //here in the breaking point [11,15,6,8,9,10] -> 15>6 is the breaking point so pivot is at index 1
    //i is largest  and i+1 is smallest 
    //here increament and decreament should be done rotatedly so use mod operator 
    //  while(lp != rp){
        //  lp = (lp + 1) % list.size();
        //  rp = (rp - 1 + list.size()) % list.size();

    // }

    public static boolean pairSum2(ArrayList<Integer> list2,int target2){
        int pivot = -1;
        int n = list2.size();
        for(int i = 0 ; i<list2.size();i++){
            if(list2.get(i) > list2.get(i+1)){ //breaking point
                pivot = i;
                break;
            
            }
        }
        int lp = pivot + 1; //smallest
        int rp = pivot; //largest
        while(lp != rp){
            // case-1
            if(list2.get(lp) + list2.get(rp) == target2){
                return true;
            }
            // case-2
            if(list2.get(lp) + list2.get(rp) < target2){
                lp = (lp + 1) % n;
            // }else{ case - 3
                rp = (rp - 1 + n) % n;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);        
        // list.add(5);
        // list.add(6);
        // int target = 5;
        // System.out.println(pairSumBrouteForce(list, target));
        // System.out.println(pairSumOptimize(list, target));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);  
        list2.add(15);
        list2.add(6);   
        list2.add(8);
        list2.add(9);
        list2.add(10);
        int target2 = 16;
        System.out.println(pairSum2(list2, target2));
    }
    
}
