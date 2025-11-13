import java.util.Scanner;

public class tugas2_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 3;
        int m = 5; 

        System.out.println("n=3 dan m=5");
        for (int i = 1; i <= m; i++) {
            if (i >= 3) {
                for (int j = 1; j <= n; j++) {
                    if (i == 3 || i == 5 || j == 1 || j == 3) {
                        System.out.print("3 ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else {
                
                for (int j = 1; j <= n; j++) {
                    System.out.print("  ");
                }
            }

            System.out.print("   "); 

            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == m || j == 1 || j == m) {
                    System.out.print("5 ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

        input.close();
    }
}
