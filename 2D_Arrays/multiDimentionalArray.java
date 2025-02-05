import java.util.*;
public class multiDimentionalArray {

    public static void printMatrix(int matrix[][]) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void add(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        int sum[][] = new int[r1][c1];
        for(int i=0; i<r1; i++) { // row
            for(int j=0; j<c1; j++) { // column
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr2[][] = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        // printArray(arr2);

        System.out.print("Enter number of rows and columns of matrix 1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter matrix values");
        for(int i=0; i<r1; i++) {
            for(int j=0; j<c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter number of rows and columns of matrix 2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter matrix values");
        for(int i=0; i<r2; i++) {
            for(int j=0; j<c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(a);
        System.out.println("Matrix 2:");
        printMatrix(b);

        System.out.println("Addition: ");
        add(a, r1, c1, b, r2, c2);

    }
} 