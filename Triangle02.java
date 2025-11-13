import java.util.Scanner;

public class Triangle02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1; // mulai dari 1 agar baris pertama berisi satu bintang
        while (i <= n) { // jalankan sampai baris ke-n
            int j = 1;
            while (j <= i) { // jumlah bintang sesuai nilai i
                System.out.print("*");
                j++;
            }
            System.out.println(); // pindah baris
            i++;
        }
    }
}
