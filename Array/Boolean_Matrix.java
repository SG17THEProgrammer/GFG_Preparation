package Array;

public class Boolean_Matrix {
    public static void main(String[] args) {

        // int [][] matrix = {{1, 0},{0, 0}};
        int matrix[][] = { { 1, 0, 0 },
                { 1, 0, 0 },
                { 1, 0, 0 },
                { 0, 0, 0 } };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Approach 1

        // boolean [] rowsArr = new boolean [rows] ;
        // boolean [] colsArr = new boolean [cols] ;

        // //TC - O(n^2)
        // //SC - O(n)

        // //whereever there is 1 we will make it true
        // for (int i = 0; i < rows; i++){
        // for (int j = 0; i < cols; i++) {
        // if(matrix[i][j]==1) {
        // rowsArr[i]=true;
        // colsArr[j]=true;
        // }
        // }
        // }
        // //making true values 1
        // for (int i = 0; i <rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // if(rowsArr[i] || colsArr[j]){
        // matrix[i][j] =1;
        // }
        // }
        // }

        // //printing it
        // for (int i = 0; i <rows; i++) {
        // System.out.println();
        // for (int j = 0; j < cols; j++) {
        // System.out.print(matrix[i][j]+" ");
        // }
        // }





        
        // Approach 2

        boolean first_row = false;
        boolean first_col = false;

        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 1) {
                first_row = true;
                break;
            }
        }

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 1) {
                first_col = true;
                break;
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[i][j] == 1) {
                    matrix[0][j] = 1;
                    matrix[i][0] = 1;

                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {

                if (matrix[0][j] == 1 || matrix[i][0] == 1) {

                    matrix[i][j] = 1;

                }
            }
        }

        for (int i = 0; i < rows && first_col; i++) {
            matrix[i][0] = 1;
        }

        for (int i = 0; i < cols && first_row; i++) {
            matrix[0][i] = 1;
        }

        // printing it
        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }

}