import java.util.*;

public class Strings {

    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void palindromeString(String str){ //o(n/2)
        int n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println(" String is Palindrome");
    }


    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'E'){
                x++;
            }
            else if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) == 'N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
        }
        float X2 = x*x;
        float Y2 = y*y;

        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
        // char arr [] = {'a','b','c'};
        // String str = "abcd";
        // String Str2 = new String("xyz");
        // //Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println(name);

        // String fullname = "tony Stark";
        // System.out.println(fullname.length());
        //concatenation
        // String firstName = "hema";
        // String lastName = "vallika";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // printLetters(fullName);

        // String str = "maedam";
        // palindromeString(str);

        // String str = "WNEENESENNN";
        // System.out.println(shortestPath(str));

        

    }
    
}
