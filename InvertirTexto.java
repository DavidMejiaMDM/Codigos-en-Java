import java.util.Scanner;

public class InvertirTexto {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Ingrese un texto: ");
String texto = scanner.nextLine();  
String textoInvertido = invertirCadena(texto);
    System.out.println("La cadena invertida es: " + textoInvertido);
}
public static String invertirCadena(String cadena) {
StringBuilder resultado = new StringBuilder();
    for (int i = cadena.length() - 1; i >= 0; i--) {
resultado.append(cadena.charAt(i));
    }
        return resultado.toString();
    }
}

