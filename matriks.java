import java.util.Scanner;

public class matriks {
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
}
