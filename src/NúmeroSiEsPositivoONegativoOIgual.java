import java.util.Scanner;
public class NúmeroSiEsPositivoONegativoOIgual {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println( " Ingrese un número ");
    int num = sc.nextInt();
    if (num > 0) {System.out.println( " el número es positivo ");
    } else if (num < 0) {System.out.println( " El número es negativo ");
    } else { System.out.println( " El número es igual a cero ");

    }

    }
}




