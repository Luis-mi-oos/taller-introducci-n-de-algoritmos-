import java.util.Scanner;
public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota (0-100): ");
        int nota = sc.nextInt();
        if (nota < 5) {
            System.out.println("Valor a pagar: Gratis");
        } else if (nota <= 18) {
            System.out.println("Valor a pagar: $5");
        } else if (nota <= 60) {
            System.out.println("Valor a pagar: $10");
        } else {
            System.out.println("Valor a pagar: $7");
        }
    }
}