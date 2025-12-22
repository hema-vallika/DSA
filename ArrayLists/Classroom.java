import java.util.*;
public class Classroom {
    public static void swap(ArrayList<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //adding elements
        list.add(10); //o(1)
        list.add(20);
        list.add(30);
        System.out.println(list);

        //getting elements
        //int ele = list.get(1); //o(1)
        //System.out.println(ele);
        
        //removing elements
        //list.remove(1); //o(n)
        // System.out.println(list);

        //setting elements/updating elements
        // list.set(1, 200); //o(n)
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(30)); //o(n)

        //size
        // System.out.println(list.size()); //o(1)

        //print the arraylist
        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }

        //reverse the arraylist o(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }

        //maximum in arraylist o(n)
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     // if(list.get(i)>max){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max, list.get(i));
        // }
        // System.out.println("Maximum element is: " + max);


        // swap two numbers in arraylist
        // System.out.println("Before swap: " + list);
        // swap(list, 0, 2);
        // System.out.println("After swap: " + list);


        //sorting the arraylist 
        Collections.sort(list); //o(nlogn)
        System.out.println("Sorted list: " + list);

    }
    
}
