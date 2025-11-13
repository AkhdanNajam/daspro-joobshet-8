import java.util.Scanner;

public class tugas1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            int jumlahKuadrat = 0;
            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            while (j <= i) {
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
                j++;
            }
            System.out.println(" = " + jumlahKuadrat);

            i++;
        }

        sc.close();
    }
}
