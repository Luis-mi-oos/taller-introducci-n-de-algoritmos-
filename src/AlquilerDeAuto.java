import java.util.Scanner;
public class AlquilerDeAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese horas de uso: ");
        int horas = sc.nextInt();
        System.out.print("Ingrese valor por hora: ");
        double valorHora = sc.nextDouble();
        double total;
        if (horas <= 10) {
            total = horas * valorHora;
        } else {
            int horasExtra = horas - 10;
            double costoNormal = 10 * valorHora;
            double costoExtra = horasExtra * (valorHora * 0.8);
            total = costoNormal + costoExtra;
        }
        System.out.println("Total a pagar: " + total);
    }
}
