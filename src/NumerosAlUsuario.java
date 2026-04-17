import java.util.Scanner;
public class NumerosAlUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese número 1: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese número 2: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese número 3: ");
        int n3 = sc.nextInt();
        System.out.print("Ingrese número 4: ");
        int n4 = sc.nextInt();
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
