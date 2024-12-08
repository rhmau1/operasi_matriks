import java.util.Scanner;

public class matriks {
    static double[][] matriksHasil;
    static int[][] matriks1;
    static int[][] matriks2;
    static int baris1, baris2, kolom1, kolom2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("===Operasi Matriks===");
            System.out.println("1. Penjumlahan matriks");
            System.out.println("2. Pengurangan matriks");
            System.out.println("3. Perkalian matriks");
            System.out.println("4. Invers");
            System.out.println("5. Transpose");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt();
            sc.nextLine(); // Menghilangkan newline setelah input angka

            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.println("--- Penjumlahan ---");
                    // Input ukuran matriks
                    System.out.print("masukkan jumlah baris matriks 1: ");
                    baris1 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 1: ");
                    kolom1 = sc.nextInt();
                    System.out.println("------------------------------");
                    System.out.print("masukkan jumlah baris matriks 2: ");
                    baris2 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 2: ");
                    kolom2 = sc.nextInt();
                    matriks1 = new int[baris1][kolom1];
                    matriks2 = new int[baris2][kolom2];
                    // Validasi ukuran matriks
                    if (matriks1.length != matriks2.length || matriks1[0].length != matriks2[0].length) {
                        System.out.println("Error: Dimensi matriks harus sama untuk penjumlahan!");
                        return;
                    }
                    // Input matriks pertama
                    System.out.println("Masukkan elemen matriks pertama:");
                    input(sc, matriks1);

                    // Input matriks kedua
                    System.out.println("Masukkan elemen matriks kedua:");
                    input(sc, matriks2);

                    System.out.println("Hasil penjumlahan matriks:");
                    double[][] sum = addMatrices(matriks1, matriks2);
                    printHasil(sum);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("--- Pengurangan ---");
                    // Input ukuran matriks
                    System.out.print("masukkan jumlah baris matriks 1: ");
                    baris1 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 1: ");
                    kolom1 = sc.nextInt();
                    System.out.println("------------------------------");
                    System.out.print("masukkan jumlah baris matriks 2: ");
                    baris2 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 2: ");
                    kolom2 = sc.nextInt();
                    matriks1 = new int[baris1][kolom1];
                    matriks2 = new int[baris2][kolom2];
                    // Validasi ukuran matriks
                    if (matriks1.length != matriks2.length || matriks1[0].length != matriks2[0].length) {
                        System.out.println("Error: Dimensi matriks harus sama untuk pengurangan!");
                        return;
                    }

                    // Input matriks pertama
                    System.out.println("Masukkan elemen matriks pertama:");
                    input(sc, matriks1);

                    // Input matriks kedua
                    System.out.println("Masukkan elemen matriks kedua:");
                    input(sc, matriks2);

                    System.out.println("Hasil penjumlahan pengurangan:");
                    double[][] difference = subtractMatrices(matriks1, matriks2);
                    printHasil(difference);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("--- Perkalian ---");
                    System.out.print("masukkan jumlah baris matriks 1: ");
                    baris1 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 1: ");
                    kolom1 = sc.nextInt();
                    System.out.println("------------------------------");
                    System.out.print("masukkan jumlah baris matriks 2: ");
                    baris2 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 2: ");
                    kolom2 = sc.nextInt();
                    if (kolom1 != baris2) {
                        System.out.println(
                                "operasi tidak dapat dilakukan. Jumlah kolom matriks1 harus sama dengan jumlah baris matriks2.");
                        return;
                    }
                    matriks1 = new int[baris1][kolom1];
                    matriks2 = new int[baris2][kolom2];
                    perkalian(matriks1, matriks2, sc);
                    System.out.println("--- Hasil Perkalian ---");
                    printHasil(matriksHasil);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("--- Invers ---");
                    invers(matriks1, sc);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("--- Transpose ---");
                    // Input ukuran matriks
                    System.out.print("masukkan jumlah baris matriks 1: ");
                    baris1 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 1: ");
                    kolom1 = sc.nextInt();
                    System.out.println("------------------------------");
                    System.out.print("masukkan jumlah baris matriks 2: ");
                    baris2 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 2: ");
                    kolom2 = sc.nextInt();

                    // Input matriks pertama
                    System.out.println("Masukkan elemen matriks pertama:");
                    matriks1 = new int[baris1][kolom1];
                    input(sc, matriks1);

                    // Input matriks kedua
                    System.out.println("Masukkan elemen matriks kedua:");
                    matriks2 = new int[baris2][kolom2];
                    input(sc, matriks2);

                    System.out.println("Transpose matriks pertama:");
                    double[][] transpose1 = transposeMatrix(matriks1);
                    printHasil(transpose1);

                    System.out.println("Transpose matriks kedua:");
                    double[][] transpose2 = transposeMatrix(matriks2);
                    printHasil(transpose2);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    return;
            }
        }
    }

    public static int[][] input(Scanner sc, int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("Masukkan angka baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " : ");
                matriks[i][j] = sc.nextInt();
            }
        }
        return matriks;
    }

    public static double[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        matriksHasil = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matriksHasil[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matriksHasil;
    }

    // Fungsi untuk pengurangan
    public static double[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        matriksHasil = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matriksHasil[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matriksHasil;
    }

    public static void perkalian(int[][] matriks1, int[][] matriks2, Scanner sc) {
        System.out.println("------------------------------");
        System.out.println("masukkan matriks 1: ");
        input(sc, matriks1);
        System.out.println("------------------------------");
        System.out.println("masukkan matriks 2: ");
        input(sc, matriks2);
        matriksHasil = new double[matriks1.length][matriks2[0].length];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                matriksHasil[i][j] = 0;
                for (int k = 0; k < matriks1[0].length; k++) {
                    matriksHasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
    }

    public static void invers(int[][] matriks1, Scanner sc) {
        System.out.println("1. invers 2x2");
        System.out.println("2. invers 3x3");
        System.out.print("masukkan pilihan: ");
        int pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println();
                System.out.println("--- invers 2x2 ---");
                System.out.println("------------------");
                System.out.println("masukkan elemen matriks: ");
                matriks1 = new int[2][2];
                input(sc, matriks1);
                double determinan = determinan2x2(matriks1);
                if (determinan == 0) {
                    System.out.println("operasi tidak dapat dilakukan karena determinan 0");
                    return;
                }
                double[][] invers2 = invers2x2(matriks1, determinan);
                System.out.println("--- Hasil Invers ---");
                printHasil(invers2);
                break;
            case 2:
                System.out.println();
                System.out.println("--- invers 3x3 ---");
                System.out.println("------------------");
                System.out.println("masukkan elemen matriks: ");
                matriks1 = new int[3][3];
                input(sc, matriks1);
                double[][] hasil3 = invers3x3(matriks1);
                System.out.println("--- Hasil Invers ---");
                printHasil(hasil3);
                break;
            default:
                System.out.println("pilihan tidak tersedia");
                break;
        }
    }

    public static double[][] invers2x2(int[][] matriks1, double determinan) {
        double[][] invers = new double[2][2];
        invers[0][0] = matriks1[1][1] / determinan; // d
        invers[0][1] = -matriks1[0][1] / determinan; // -b
        invers[1][0] = -matriks1[1][0] / determinan; // -c
        invers[1][1] = matriks1[0][0] / determinan; // a
        return invers;
    }

    public static double determinan2x2(int[][] matriks1) {
        double determinan = matriks1[0][0] * matriks1[1][1] - matriks1[1][0] * matriks1[0][1];
        return determinan;
    }

    public static double[][] invers3x3(int[][] matriks) {

        // Elemen matriks
        double a = matriks[0][0], b = matriks[0][1], c = matriks[0][2];
        double d = matriks[1][0], e = matriks[1][1], f = matriks[1][2];
        double g = matriks[2][0], h = matriks[2][1], i = matriks[2][2];

        // Hitung determinan
        double determinan = (a * e * i + b * f * g + c * d * h)
                - (c * e * g + a * f * h + b * d * i);

        if (determinan == 0) {
            System.out.println("Matriks tidak memiliki invers (determinan nol).");
            return null; // Keluar jika determinan nol
        }

        // Hitung kofaktor
        double[][] kofaktor = {
                { e * i - f * h, -(b * i - c * h), b * f - c * e },
                { -(d * i - f * g), a * i - c * g, -(a * f - c * d) },
                { d * h - e * g, -(a * h - b * g), a * e - b * d }
        };

        // Transpose kofaktor untuk menghasilkan adjoin
        double[][] adjoin = new double[3][3];
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                adjoin[j][k] = kofaktor[k][j];
            }
        }

        // Hitung invers matriks
        double[][] invers = new double[3][3];
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                invers[j][k] = adjoin[k][j] / determinan;
            }
        }

        return invers;
    }

    // Fungsi untuk transpose matriks
    public static double[][] transposeMatrix(int[][] matrix) {
        matriksHasil = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matriksHasil[j][i] = matrix[i][j];
            }
        }
        return matriksHasil;
    }

    public static void printHasil(double[][] matriksHasil) {
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[0].length; j++) {
                System.out.print(matriksHasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
