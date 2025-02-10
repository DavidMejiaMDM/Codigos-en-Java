import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Programa {
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
System.out.println("por favor ingrese los milisegundos: ");
long n = teclado.nextLong();
teclado.close();

Date fecha1 = new Date(n);
System.out.println("La Fecha y hora en su Formato Local: " + fecha1.toString());

SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
String fechaGMT = sdf.format(fecha1);
System.out.println("Fecha y hora en formato GMT: " + fechaGMT);
    }
}