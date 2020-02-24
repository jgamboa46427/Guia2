import java.util.Scanner; 
import java.util.*;  
/**
 * DesviacionEstandar
 * 
 * JOHN GAMBOA , HERNAN SEGURA
 * 1.0
 */
public class DesviacionEstandar
{
    
    public static void main (String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" ***CALCULO DESVIACION ESTANDAR*** ");
        int n = 0;
        do {
            System.out.print("Cuantos numeros va a digitar: ");
            n = entrada.nextInt();
        } while (n <= 0);
        
        int posicion = 0;
        double promedio;
        double [] arreglo = new double [n];//Declara el arreglo
        double suma = 0;
        double calculo = 0;
        
        
        for ( int contador = n ; contador > 0  ; contador--){
                    System.out.print("Digite el numero: " );
                    arreglo [posicion]= entrada.nextInt();
                    posicion ++ ;

                }
        
        
        for (int contador = 0 ; contador < arreglo.length ; contador++){
            suma += arreglo[contador];
                }
                
    promedio = suma / arreglo.length;
    System.out.println("Promedio: " + promedio);
    
    
        for (int contador = 0 ; contador < arreglo.length ; contador++){
                    
                    calculo += Math.pow((arreglo[contador]- promedio),2);
            
                    
            }
    calculo = Math.sqrt(calculo / arreglo.length);
    System.out.print("Desviacion estandar: " + calculo);
}
    
}
