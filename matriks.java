import java.util.Scanner;

public class matriks {
    static int[][] matriksHasil;
    static int[][] matriks1;
    static int[][] matriks2;

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
                    break;
                case 2:
                    System.out.println();
                    System.out.println("--- Pengurangan ---");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("--- Perkalian ---");
                    System.out.print("masukkan jumlah baris matriks 1: ");
                    int baris1 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 1: ");
                    int kolom1 = sc.nextInt();
                    System.out.println("------------------------------");
                    System.out.print("masukkan jumlah baris matriks 2: ");
                    int baris2 = sc.nextInt();
                    System.out.print("masukkan jumlah kolom matriks 2: ");
                    int kolom2 = sc.nextInt();
                    if (kolom1 != baris2) {
                        System.out.println("operasi tidak dapat dilakukan");
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
                    break;
                case 5:
                    System.out.println();
                    System.out.println("--- Transpose ---");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    return;
            }
        }
    }

    public static void input(Scanner sc, int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.print("Masukkan angka baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + " : ");
                matriks[i][j] = sc.nextInt();
            }
        }
    }

    public static void perkalian(int[][] matriks1, int[][] matriks2, Scanner sc) {
        System.out.println("------------------------------");
        System.out.println("masukkan matriks 1: ");
        input(sc, matriks1);
        System.out.println("------------------------------");
        System.out.println("masukkan matriks 2: ");
        input(sc, matriks2);
        matriksHasil = new int[matriks1.length][matriks2[0].length];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                matriksHasil[i][j] = 0;
                for (int k = 0; k < matriks1[0].length; k++) {
                    matriksHasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
    }

    public static void printHasil(int[][] matriksHasil) {
        for (int i = 0; i < matriksHasil.length; i++) {
            for (int j = 0; j < matriksHasil[0].length; j++) {
                System.out.print(matriksHasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
