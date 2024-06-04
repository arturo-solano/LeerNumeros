package lecturanumeros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class LecturaNumeros extends BufferedReader {

    // Constructor para leer desde el teclado
    public LecturaNumeros() {
        super(new InputStreamReader(System.in));
    }

    // Constructor que recibe un objeto Reader
    public LecturaNumeros(Reader r) {
        super(r);
    }

    // Método para leer un int
    public int readInt() throws IOException {
        return Integer.parseInt(readLine());
    }

    // Método para leer un int con mensaje
    public int readInt(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInt();
    }

    // Método para leer un Integer
    public Integer readInteger() throws IOException {
        return Integer.valueOf(readLine());
    }

    // Método para leer un Integer con mensaje
    public Integer readInteger(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readInteger();
    }

    // Método para leer un double
    public double readDouble() throws IOException {
        return Double.parseDouble(readLine());
    }

    // Método para leer un double con mensaje
    public double readDouble(String mensaje) throws IOException {
        System.out.print(mensaje);
        return readDouble();
    }
}