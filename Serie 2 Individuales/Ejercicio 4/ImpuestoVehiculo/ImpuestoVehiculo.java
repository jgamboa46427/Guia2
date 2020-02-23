import java.util.Scanner;
/**
 * ImpuestoVehiculo 
 * 
 * @author JOHN GAMBOA
 * @version 1.0
 */
public class ImpuestoVehiculo
{
    
    public static void main (String [] args)
    {
    double impuesto=0, precioBruto, precioNeto,tipoVehiculo;
    System.out.println("CALCULO DE IMPUESTO");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite 1 para AUTOMOVIL o Digite 2 para CAMIONETA");
    tipoVehiculo = entrada.nextDouble();
    System.out.println("Digite el precio");
    precioBruto = entrada.nextDouble();
        if (tipoVehiculo == 2 && precioBruto < 80)
        impuesto = 0;
        if (tipoVehiculo == 2 && precioBruto >= 80)
        impuesto = precioBruto / 2;
        if (tipoVehiculo == 1 && precioBruto < 20)
        impuesto = 5;
        if (tipoVehiculo == 1 && precioBruto >= 20 && precioBruto<=40)
        impuesto =  precioBruto / 5;
        if (tipoVehiculo == 1 && precioBruto > 40)
        impuesto = 9;
        System.out.print("El impuesto a pagar es " + impuesto + " y el precio neto es ");
        System.out.print(precioNeto = precioBruto + impuesto);
    }
    
   

}
