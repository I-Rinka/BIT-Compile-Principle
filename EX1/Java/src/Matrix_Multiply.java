/**
 * Matrix_Multiply
 */
public class Matrix_Multiply {

    public static void main(String[] args) {
        int size = 1000;
        int[][] matrix1 = new int[size][size];
        int[][] matrix2 = new int[size][size];

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix1[i][j] = i + 1;
                matrix2[i][j] = i + 1;
            }
        }

        int[][] ans = new int[size][size];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                int tmp = 0;
                for (int n = 0; n < ans.length; n++) {
                    tmp += matrix1[i][n] * matrix2[n][j];
                }
                ans[i][j] = tmp;
            }
        }
        
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j]);
                System.out.print(',');
            }
            System.out.println();
        }

    }
}