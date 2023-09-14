import java.util.Scanner;

/** Programa que calcule la conversion de dolares a pesos**/
public class Main {
    public static void main(String[] args) {
        final double TASA_DOLAR = 56.25;
        double monto;
        double total;
        String usuario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("iNGRESE SU NOMBRE: ");
        usuario = scanner.nextLine();

        System.out.println("iNGRESE EL MONTO EN DOLARES QUE DESEA CONVERTIR A PESOS");
        monto = scanner.nextDouble();

        total = TASA_DOLAR * monto;
        System.out.println("BIENVENIDO" + usuario);
        System.out.println("LA CONVERSION ES: RD$100");


    }
}