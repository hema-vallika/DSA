import java.util.*;

public class ArraysCC {
    public static void update(int marks []){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1; // incrementing each mark by 1
        }
    }
    public static void main(String[] args) {
        int marks []= {97,99,93};
        //original marks
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        update(marks);
         for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }

        
    //    int len =  marks.length;
    //     System.out.print(len);

        // System.out.println("Enter the marks of 3 subjects:");
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();    
        // marks[2] = sc.nextInt();
        // System.out.println("maths:" + marks[0]);
        // System.out.println("physics:" + marks[1]);
        // System.out.println("chemistry:" + marks[2]);
        // System.out.println("Total marks: " + (marks[0] + marks[1] + marks[2]));

        // marks[2] = 100; // updating the marks of chemistry
        // System.out.println("Updated chemistry marks: " + marks[2]);
    }
}
