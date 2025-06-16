public class JavaBasics {
   public static void printHelloWorld(){
      System.out.println("Hello, World!");
   }


   public static void swap(int a, int b) {
      int temp = a;
      a = b;
      b = temp;
      System.out.println("After swapping: a = " + a + ", b = " + b);
   }

   public static int factorial(int n) {
      if (n == 0 || n == 1) {
         return 1;
      }
      return n * factorial(n - 1);
   }

   public static int multiply(int x, int y) {
      return x * y;
   }

   public static int multiply(int x, int y, int z) {
      return x * y * z;
   }

   public static boolean isPrime(int n) {
      //corner case
         if (n <= 1) {
            return false;
         }
         if(n == 2 ) {
            return true;
         }
         for (int i = 2; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
               return false;
            }
         }
         return true;
      }

   public static void primesInRange(int n) {
      for (int i = 2; i <= n; i++) {
         if (isPrime(i)) {
            System.out.print(i + " ");
         }
      }
      System.out.println();
   }

   public static int binomialCoefficient(int n, int r) {
      int n_fact = factorial(n);
      int r_fact = factorial(r);
      int n_r_fact = factorial(n - r);
      int binCoeff = n_fact / (r_fact * n_r_fact);
      return binCoeff;
   }

   public static void binToDec(int binNum){
      int pow=0;
      int decNum=0;
      while (binNum > 0) {
         int lastDigit = binNum % 10;
         decNum += lastDigit * Math.pow(2, pow);
         pow++;
         binNum /= 10;
      }
      System.out.println("Decimal equivalent: " + decNum);

   }
  
   public static void decToBin(int decNum) {
      int pow=0;
      int binNum=0;
      while (decNum > 0) {
         int rem = decNum % 2;
         binNum += rem * Math.pow(10, pow);
         pow++;
         decNum /= 2;
     
      }
      System.out.println("Binary equivalent: " + binNum);
   }
  
  
   public static void main(String[] args) {
      // printHelloWorld();
      // int a = 5;
      //    int b = 10;
      //  int result = multiply(a, b);
      //    System.out.println("Multiplication result: " + result);
      // System.out.println("Factorial of 5: " + factorial(5));
      // System.out.println("Binomial Coefficient C(5, 2): " + binomialCoefficient(5, 2));
      // function overloading -- same function name but  different parameters(parameter type should be different or parameter no. should be different)(it is independent of return type)
      // System.out.println("Multiplication of 2 numbers: " + multiply(5, 10));
      // System.out.println("Multiplication of 3 numbers: " + multiply(5, 10, 2));
      // System.out.println("Is 2 prime? " + isPrime(2));
      // primesInRange(100);
      // binToDec(101);
      // decToBin(7);
   }
}