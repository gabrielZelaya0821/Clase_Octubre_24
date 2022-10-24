package clase_24_octubre;
import java.util.Scanner;

public class Clase_24_Octubre {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una letra:");
        char letra = entrada.next().charAt(0);
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }
        
        System.out.println("Ingrese el número del mes que desea:");
        int mes = entrada.nextInt();
        System.out.println("Ingrese el año que desea:");
        int año = entrada.nextInt();
        int biciesto;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("El mes número " + mes + " tiene 31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("El mes número " + mes + " tiene 30 días");
            case 2:
                biciesto = año % 4;
                if (biciesto == 0) {
                    System.out.println("El mes tiene 29 días");
                } else {
                    System.out.println("El mes tiene 28 días");
                }
                
        }
    }
    
}
