import java.util.Scanner;

public class function {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan jumlah baris: ");
        int rows = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int cols = scanner.nextInt();

        // Input matriks pertama
        System.out.println("Masukkan elemen matriks pertama:");
        int[][] matrix1 = new int[rows][cols];
        inputMatrix(scanner, matrix1);

        // Input matriks kedua
        System.out.println("Masukkan elemen matriks kedua:");
        int[][] matrix2 = new int[rows][cols];
        inputMatrix(scanner, matrix2);

        // Validasi ukuran matriks
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Error: Dimensi matriks harus sama untuk penjumlahan dan pengurangan!");
            return;
        }

        // Operasi penjumlahan
        System.out.println("Hasil penjumlahan matriks:");
        int[][] sum = addMatrices(matrix1, matrix2);
        printMatrix(sum);

        // Operasi pengurangan
        System.out.println("Hasil pengurangan matriks:");
        int[][] difference = subtractMatrices(matrix1, matrix2);
        printMatrix(difference);

        // Operasi transpose
        System.out.println("Transpose matriks pertama:");
        int[][] transpose1 = transposeMatrix(matrix1);
        printMatrix(transpose1);

        System.out.println("Transpose matriks kedua:");
        int[][] transpose2 = transposeMatrix(matrix2);
        printMatrix(transpose2);

        scanner.close();
    }

    // Fungsi untuk mengisi elemen matriks
    private static void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Elemen [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Fungsi untuk penjumlahan
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Fungsi untuk pengurangan
    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Fungsi untuk transpose matriks
    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Fungsi untuk mencetak matriks
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
