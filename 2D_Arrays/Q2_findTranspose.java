import java.util.Scanner;
public class Q2_findTranspose {

    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] findTranspose(int matrix[][], int r, int c) {
        int transp[][] = new int[c][r];

        for(int i=0; i<c; i++) {
            for(int j=0; j<r; j++) {
                transp[i][j] = matrix[j][i];
            }
        }
        return transp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows & columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];

        System.out.println("Enter matrix values: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        printMatrix(matrix);

        int ans[][] = findTranspose(matrix, r, c);
        System.out.println("Transpose:");
        printMatrix(ans);
    }
}