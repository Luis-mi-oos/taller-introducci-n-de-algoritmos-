import java.util.Scanner;
public class NúmeroImparOPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" ingrese un número ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(" el número es par ");
        } else {
            System.out.println(" El número es impar ");
        }
    }

}
