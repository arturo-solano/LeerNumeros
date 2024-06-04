package lecturanumeros;

/*import lecturanumeros.LecturaNumeros;*/
import java.io.IOException;

public class ClasePrueba {
    public static void main(String[] args) {
        LecturaNumeros lector = new LecturaNumeros();

        try {
            // Leer dos enteros
            System.out.println("Ingrese el primer entero: ");
            int num1 = lector.readInt();
            int num2 = lector.readInt("Ingrese el segundo entero: ");

            // Leer un Integer
            Integer num3 = lector.readInteger("Ingrese un Integer: ");

            // Leer un double
            System.out.println("Ingrese el primer entero: ");
            double num4 = lector.readDouble();

            // Leer un Double
            Double num5 = lector.readDouble("Ingrese un Double: ");

            // Mostrar los valores leídos
            System.out.println("Valores ingresados:");
            System.out.println("Primer entero: " + num1);
            System.out.println("Segundo entero: " + num2);
            System.out.println("Integer: " + num3);
            System.out.println("Double: " + num4);
            System.out.println("Double (objeto): " + num5);

        } catch (IOException e) {
            System.err.println("Error de entrada/salida: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Formato de número inválido: " + e.getMessage());
        }
    }
}
