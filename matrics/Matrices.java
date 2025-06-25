import java.util.*;

public class Matrices {
    public static boolean search(int matrix [][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                if(matrix[i][j] == key){
                    System.out.println("key is at index "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;

    }


    public static void  printSpiral(int matrix [][]){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i = startRow + 1; i <= endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j = endCol - 1; j >= startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i = endRow - 1; i >= startRow + 1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();

    }


    public static int diagonalSum(int matrix [][]){ //o(n^2)
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i == j){ //primary diagonal
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length - 1){ //secondary diagonal
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }


    public static int diagonalSumOptimized(int matrix [][]){ //o(n)
        int sum = 0;
        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            sum += matrix[i][i];
            //secondary diagonal  //i+j = n-1   => j=n-1-i
            if(i != matrix.length - 1 - i){ //middle wala element dobara add na karne ke liye ccondition
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

// special cell (0,m-1) key < cell value => go left
//                      key > cell value => go bottom
//special cell (n-1,0)  key < cell value => go top
//                      key > cell value => go right

    public static void stairCaseTopRightSearch(int matrix [][],int key){ //o(n+m)
        //cell (0,m-1)
        int row = 0;
        int col = matrix[0].length - 1;//m-1
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("key found at ("+row+","+col+")");
                return;
            }
            else if(matrix[row][col] < key){
                row++; //move bottom
            }
            else{
                col--; // move left
            }
        }
        System.out.println("key not found");
    }


    public static void stairCaseBottomUpSearch(int matrix [][],int key){
        //cell(n-1,0)
        int row = matrix.length - 1;
        int col = 0;
        while(row >= 0 && col <matrix[0].length){
            if(matrix[row][col] == key){
                System.out.println("key found at ("+row+","+col+")");
                return;
            }
            else if(key > matrix[row][col]){
                col++;//move right
            }
            else{
                row-- ;//move top
            }
        }
        System.out.println("key not found");
      

    }

    

    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};

         int key = 30;               
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i < matrix.length; i++) {
        //     for(int j=0;j<matrix[i].length;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
       
        // printSpiral(matrix);

        // System.out.println(diagonalSum(matrix));
        // System.out.println(diagonalSumOptimized(matrix));
        // stairCaseTopRightSearch(matrix, key);
        stairCaseBottomUpSearch(matrix, key);


        // search(matrix,5);
    }

    
}