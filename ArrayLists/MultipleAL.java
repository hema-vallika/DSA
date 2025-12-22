package ArrayLists;

import java.util.ArrayList;

public class MultipleAL {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // Create first inner ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        // Create second inner ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        // Create third inner ArrayList
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i = 1; i <= 5; i++){
            list1.add(i*1); // 1, 2, 3, 4, 5
            list2.add(i*2); // 2, 4, 6, 8, 10
            list3.add(i*3); // 3, 6, 9, 12, 15
        }
        // Add inner lists to mainList
        mainList.add(list1);        
        mainList.add(list2);        
        mainList.add(list3);
        

        // Print the 2D ArrayList
        System.out.println(mainList);
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
    
}
