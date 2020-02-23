import java.util.Scanner;
/**
 * ConversionUnidades
 * 
 * JOHN GAMBOA
 * @version 1.0
 */
public class ConversionUnidades
{
    
    public static void main (String [] args)
    {
     String opcionSeleccionada;
     double numeroConvertir;
     System.out.println("CONVERSION DE UNIDADES DE MEDIDA A PULGADAS");  
     Scanner entrada = new Scanner(System.in);
     System.out.println("Digite ‘P’ para pie,‘C’ para centímetro, ‘L’ para legua, y ‘Y’ para yarda)"); // Indicador
     opcionSeleccionada = entrada.nextLine(); // Lee la opcion seleccionada por el usuario
     System.out.println("Numero a convertir");
     numeroConvertir = entrada.nextDouble();
     switch (opcionSeleccionada)
     {
         case "P": 
         numeroConvertir = ConversionUnidades.calculoPie(numeroConvertir);
  
         break;
         
         case "C":
         numeroConvertir = ConversionUnidades.calculoCm(numeroConvertir);
         
         break;
         
         case "L":
         numeroConvertir = ConversionUnidades.calculoLegua(numeroConvertir);
       
         break;
         
         case "Y":
         numeroConvertir = ConversionUnidades.calculoYarda(numeroConvertir);
         
         break;
        }
        
        System.out.println("El resultado es " + numeroConvertir + " Pulgadas");
    }
    public static double calculoPie (double numero){
            double pies = 0.0833;
            double resultado = numero / pies;
            return resultado;
        }
        
    public static double calculoCm (double numero){
            double cm = 2.54;
            double resultado = numero / cm;
            return resultado;
        }
        
    public static double calculoLegua (double numero){
            double legua = 190080.02;
            double resultado = numero * legua;
            return resultado;
        }
    
    public static double calculoYarda (double numero){
            double yarda = 36;
            double resultado = numero * yarda;
            return resultado;
        }
    
}
  

