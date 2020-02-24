
import java.util.Scanner;
/**
 * CalculoPromedio
 * 
 * JHON GAMBOA , HERNAN SEGURA
 * 1.0
 */
public class CalculoPromedio

{
    public static void main (String [] args)
    {
    
    Scanner entrada = new Scanner(System.in);
    System.out.print("Cuantos numeros va digitar: ");
    int n = entrada.nextInt();
    int promedio = 0;
    int [] arreglo; //Declara el arreglo
    int posicion = 0;
    arreglo = new int [n]; //Se inicializa
    int suma = 0;
    int mayor = 0;
    int menor = 0;
    

      for ( int contador = n ; contador > 0  ; contador--){
                    System.out.print("Digite el numero: " );
                    arreglo [posicion]= entrada.nextInt();
                    posicion ++ ;

                }
                menor = arreglo[0];
        for (int contador = 0 ; contador < arreglo.length ; contador++){
                    
                    
                    
               
                    if ( mayor < arreglo[contador] ){
                            mayor = arreglo[contador];
                        }
                        
                   
                        if ( arreglo[contador] < menor ){
                            menor = arreglo[contador];
                        }    
                        
                        
                    
                        
                        suma += arreglo[contador]; 
            
                    
            }
            promedio = suma / arreglo.length;
        System.out.println("Promedio: " + promedio); 
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
      
        }
        
      
    
    
}

    
    

