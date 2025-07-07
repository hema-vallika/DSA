public class Recursion1 {
    public static void printDescent(int n){
        if(n==1){
            System.out.print("1");
            return;
        }
        System.out.print(n + " ");

        printDescent(n-1);

    }

    public static void printInc(int n){
        if(n == 1){
            System.out.println("1");
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }


    public static int sumOfNno(int n){
      
        if(n==0){
            return 0;
        }
        return n + sumOfNno(n-1);
    }


    public static void main(String[] args) {
        // printDescent(5);
        // printInc(5);
        // System.out.println(factorial(5));
        System.out.println(sumOfNno(5));
        
    }
    
}
