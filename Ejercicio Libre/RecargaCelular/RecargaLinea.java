
/**
 * RecargaLinea 
 * 
 * JOHN GAMBOA , HERNAN SEGURA
 * 1.0
 *  Una persona realiza una recarga a su línea telefónica.En promedio habla cierto numero de minutos al día con diferentes personas, 
 *  su operador de telefonía cobra un valor por el segundo hablado. 
 *  Realice un programa que calcule en cuantos días debe volver a realizar la recarga.
 * 
 */
import java.util.Scanner;


public class RecargaLinea
{   
    public static void main(String[]args)
   
    {   
        double recarga;
        double promedio;
        double valor;
        Scanner entrada= new Scanner(System.in);
        System.out.print("Cuanto va a recargar en pesos: ");
        recarga = entrada.nextInt();
        System.out.print("Cuantos minutos habla en promedio al dia: ");
        promedio = entrada.nextInt();
        System.out.print("Cuanto cobra su operador por segundo en pesos: ");
        valor = entrada.nextInt();
        promedio = promedio * 60;
        double totalconsumo = (recarga / valor) / promedio;
        System.out.print("Debe volver a recargar en : " + totalconsumo + " dias");

    }

}