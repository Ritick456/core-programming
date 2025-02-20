import java.util.Arrays;

public class Matrix {

    public static int[][] generateMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }

    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {

        if (matrix1[0].length != matrix2[0].length && matrix1.length != matrix2.length) {
            return new int[1][1];
        }

        int n = matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] subMatrix(int[][] matrix1, int[][] matrix2) {

        if (matrix1[0].length != matrix2[0].length && matrix1.length != matrix2.length) {
            return new int[1][1];
        }

        int n = matrix1.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {

        int matrixRow1 = matrix1.length;
        int matrixcol1 = matrix1[0].length;

        int matrixRow2 = matrix2.length;
        int matrixcol2 = matrix2[0].length;

        if (matrixcol1 != matrixRow2) {
            return new int[1][1];
        }

        int[][] result = new int[matrixRow1][matrixcol2];

        for (int i = 0; i < matrixRow1; i++) {
            for (int j = 0; j < matrixcol2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < matrixcol1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] result = new int[col][row];

        for (int i = 0; i < col; i++) {  
            for (int j = 0; j < row; j++) {  
                result[i][j] = matrix[j][i];  
            }
        }

        return result;
    }

    public static void display(int[][] matrix){
        for (int[] ele : matrix) {
            System.out.println(Arrays.toString(ele));
        }
    }

    public static void main(String[] args) {

        int row = 3;
        int col = 3;

        int[][] matrix = new int[row][col];

        int[][] myMatrix1 = generateMatrix(matrix);
        int[][] myMatrix2 = generateMatrix(matrix);

        int[][] addMatrix = addMatrix(myMatrix1, myMatrix2);
        int[][] subMatrix = subMatrix(myMatrix1, myMatrix2);
        int[][] multiMatrix = multiplyMatrix(myMatrix1, myMatrix2);
        int[][] transpose = transposeMatrix(myMatrix1);

        System.out.println("mat1");
        display(myMatrix1);
        
        System.out.println("mat2");
        display(myMatrix2);
        
        System.out.println("Addition matrix");
        display(addMatrix);

        System.out.println("Substraction matrix");
        display(subMatrix);

        System.out.println("Multiplication matrix");
        display(multiMatrix);
        
        System.out.println("matrix transpose");
        display(transpose);
      
        
    }
}
