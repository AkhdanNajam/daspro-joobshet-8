import java.util.Scanner;
    public class Star02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nila n: ");
        int n = scanner.nextInt();
        for(int iOuter =1; iOuter <= n; iOuter++) {
        for (int i = 1; i <= n; i++) {
             System.out.print("*");
            }
    System.out.println();
           
        }
    }  
} 

