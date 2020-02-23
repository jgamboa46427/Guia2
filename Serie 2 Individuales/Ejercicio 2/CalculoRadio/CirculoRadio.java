import java.util.Scanner;
/**
 * CirculoRadio
 * 
 * JOHN GAMBOA
 * @version 1.0
 */
public class CirculoRadio
{
    public static void main (String [] args)
    {
     System.out.println("HALLAR AREA SOMBREADA ENTRE EL CIRCULO Y EL CUADRADO");
     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite el radio");
     double radio = entrada.nextDouble();  
     radio = CirculoRadio.areaDelCirculo(radio) - CirculoRadio.areaDelCuadrado(radio);
     System.out.println("El area sombreada es " + radio);
    }
    
    public static double areaDelCirculo (double numero){
            
            double resultado = Math.PI * Math.pow(numero,2);
            return resultado;
        }
    public static double areaDelCuadrado (double numero){
            
            double resultado = 2 * Math.pow(numero,2);
            return resultado;
        }
}
