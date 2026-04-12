import java.util.Scanner;
public class EdadSiEsMayorDeEdadONo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ingrese edad ");
        int edad = sc.nextInt();
        if (edad >= 18) {
            System.out.println(" Felicidades por ser mayor de edad ");
        } else {
            System.out.println(" Que triste eres menor de edad ");
        }
    }
}