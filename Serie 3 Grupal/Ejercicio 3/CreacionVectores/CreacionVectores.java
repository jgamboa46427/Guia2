
import java.util.*; 
/**
 * CreacionVectores
 * 
 * JOHN GAMBOA, HERNAN SEGURA
 * 1.0
 */
public class CreacionVectores
{
    public static void main (String [] args)
    {   
        Scanner entrada = new Scanner(System.in);
        int n;
        int p;
        System.out.print("Cantidad de numeros vector A: ");
        n = entrada.nextInt();
        System.out.print("Cantidad de numeros vector B: ");
        p = entrada.nextInt();
        ArrayList<Integer> lista;
        lista = new ArrayList<Integer>();
        
        int a [] = new int [n];
        
        for ( int i = 0 ; i < n  ; i++){
                    System.out.print("Digite numero vector A: " );
                    a [i]= entrada.nextInt();
                }
                
        int b [] = new int [p];
        
        for ( int k = 0 ; k < p  ; k++){
                    System.out.print("Digite numero vector B: " );
                    b [k]= entrada.nextInt();
                }
                
               
        int c[] = new int [n+p];
        
        for ( int l = 0 ; l < a.length  ; l++){
                    c [l]= a [l];
                    
                    
                }
        
                  
                
        Arrays.sort(b);
        
                
        for ( int i = 0 ; i < a.length  ; i++){
                    int valor = 0;
                    
                    while  ((a[i] != b[valor]) && (valor < (b.length-1))  ) 

{
                            valor++;
                                
                        }
                        
                        if (valor == b.length-1){lista.add(a[i]);}
                        
                }
                
        Arrays.sort(a);       
             
        
        for ( int i = 0 ; i < b.length  ; i++){
                    int valor = 0;
                    
                    while  ((b[i] != a[valor]) && (valor < (a.length-1))  ) 

{
                            valor++;
                                 
                        }
                        if (valor == a.length-1 ){lista.add(b[i]);}
                        
                }
                
                Set<Integer> limpiarDuplicados = new HashSet <Integer> (lista);
                lista.clear();
                lista.addAll(limpiarDuplicados);
                
        Collections.sort(lista);    
        for (Integer s : lista) {
           System.out.println(s);
          
            }
            
           
        }
}
            
        
        
        
            
        
        
        
    
    
                
                
        
        
       
        
        
        

    

