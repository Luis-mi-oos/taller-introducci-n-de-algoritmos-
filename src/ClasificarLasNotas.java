import java.util.Scanner;
public class ClasificarLasNotas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota (0-100): ");
        int nota = sc.nextInt();
        if (nota >= 90 && nota <= 100) {
            System.out.println("Excelente");
        } else if (nota >= 70) {
            System.out.println("Bueno");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
    }
}
