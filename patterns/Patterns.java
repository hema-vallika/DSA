public class Patterns {

    public static void hollowSquare(int r,int c){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void invertedRotatedhalfPyramid(int n){
        for(int i= 1;i<=n ;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public static void invertedHalfPyramidWithNumbers(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
  
    public static void butterflyPattern(int n){
        //upper part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //spaces
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                //spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            System.out.println();
        }  
        //lower part
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
 }

    public static void solidRhombus(int n){
        for(int i= 1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void hollowRhombus(int n){
        for(int i =1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++){
                if(j==1 || j==n || i==1 || i==n){
                    System.out.print("*");
            }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //upper part
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n-1;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // hollowSquare(4,5 );
        // invertedHalfPyramid(4);
        // invertedRotatedhalfPyramid(4);
        // invertedHalfPyramidWithNumbers(4);
        // floydTriangle(5);
        // zeroOneTriangle(5);
        // butterflyPattern(5);
        // solidRhombus(5);
        // hollowRhombus(5);
        diamond(5);



    }   
}
