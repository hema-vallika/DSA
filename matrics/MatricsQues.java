public class MatricsQues {

    public static int printNoOf7(int matrix [][]){
        int count = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        return count;
    }
    


    public static void secondRowSum(int matrix [][]){
        int sum =0;
        for(int j=0;j<matrix[0].length;j++){
            sum +=matrix[1][j];

        }
        System.out.println("sum of second row is -  "+sum);

    }


    public static void printTranspose(int matrix [][]){
        int row = matrix[0].length;
        int col = matrix.length;
        int [][] transpose = new int [row][col];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int matrix [][]={ {4,7,8},{8,8,7} };
        // System.out.println(printNoOf7(matrix));
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // secondRowSum(nums);

        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        printTranspose(matrix);
        
    }
    
}
