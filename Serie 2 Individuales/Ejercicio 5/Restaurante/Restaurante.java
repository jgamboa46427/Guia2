import java.util.Scanner;
/**
 * Restaurante 
 * 
 * JOHN GAMBOA
 * 1.0
 */
public class Restaurante
{
    //double impuesto=0.19 ,totalNeto=0,totalPago=0, valor, descuentoVeg = 0.20, descuentoNoVeg = 0.1;
    public static void main (String [] args)
    {
    double impuesto=0.19 ,totalNeto=0,totalPago=0, valor, descuentoVeg = 0.20, descuentoNoVeg = 0.1, descuento = 0;
    int opcionTipoComida, platos;
    System.out.println("PEDIDO RESTAURANTE");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite 1 para VEGETARIANA, 2 NO VEGETARIANA, 3 COMIDA RAPIDA");
    opcionTipoComida = entrada.nextInt();
    
    
    if (opcionTipoComida == 1 ){
    System.out.println("Digite 1 para SOPA VEGETALES, 2 ENSALADAS, 3 JUGOS");
    platos = entrada.nextInt();
    System.out.println("Cuantos Platos");
    int cantidad = entrada.nextInt();
    int sopaVegetales = 10000 , ensaladas = 25000, jugos = 5000;
        switch (platos)
        {   
            case 1:
            valor = (cantidad * sopaVegetales);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoVeg;
            totalPago =  totalNeto - descuento;
            break;
            
            case 2:
            valor = (cantidad * ensaladas);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoVeg;
            totalPago =  totalNeto - descuento;
            break;
            
            case 3:
            valor = (cantidad * jugos);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoVeg;
            totalPago =  totalNeto - descuento;
            break;
        }
    } 
    
    if (opcionTipoComida == 2 ){
        System.out.println("Digite 1 para BANDEJA DE CARNE, 2 BANDEJA POLLO");
        platos = entrada.nextInt();
        System.out.println("Cuantos Platos");
        int cantidad = entrada.nextInt();
        int bandejaCarne = 30000 , bandejaPollo = 28000;
          switch (platos)
        {   
            case 1:
            valor = (cantidad * bandejaCarne);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoNoVeg;
            totalPago =  totalNeto - descuento;
            break;
            
            case 2:
            valor = (cantidad * bandejaPollo);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoNoVeg;
            totalPago =  totalNeto - descuento;
            break;
        }
    }
    
     if (opcionTipoComida == 3 ){
        System.out.println("Digite 1 para PERRO CALIENTE, 2 HAMBURGUESA");
        platos = entrada.nextInt();
        System.out.println("Cuantos Platos");
        int cantidad = entrada.nextInt();
        int perros = 5000 , hamburguesa = 7000;
          switch (platos)
        {   
            case 1:
            valor = (cantidad * perros);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoNoVeg;
            totalPago =  totalNeto - descuento;
            break;
            
            case 2:
            valor = (cantidad * hamburguesa);
            impuesto = valor * impuesto;
            totalNeto = valor + impuesto;
            descuento = totalNeto * descuentoNoVeg;
            totalPago =  totalNeto - descuento;
            break;
        }
    }
        
        System.out.println ("Valor del pedido: " + totalNeto + " Descuento: " + descuento + " Total a pagar: " + totalPago); 
    }
    
}
