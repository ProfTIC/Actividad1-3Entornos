import java.util.Scanner;

/*
 * 
 *  @version 1.0
 *  @author Lola 
 *
 */

public class operaciones {
	
	 /* 
     * Este método suma dos números racionales: 2/3 y 5/4, mostrando por pantalla el resultado
     *
     */ 

    public static void n_racional_suma() {
         
    // Tenemos dos números racionales a=2/3 y b=5/4
         
        int num_res, denom_res; 
         
        int num_a = 2;
        
        int num_b = 5;
        
        int den_a = 3;
        
        int den_b = 4; 
        
        num_res=denom_res = 0;
            
        System.out.println("El resultado es: "+ num_res+ "/"+denom_res);
    }
    
     /* 
     * Este método resta dos números racionales: 2/3 y 5/4, mostrando por pantalla el resultado
     *
     */
    
    public static void n_racional_resta() {
         
    // Tenemos dos números racionales a=2/3 y b=5/4
         
        int num_res, denom_res; 
         
        int num_a = 2;
        
        int num_b = 5;
        
        int den_a = 3; 
        
        int den_b = 4; 
        
        num_res=denom_res = 0;
        
        System.out.println("El resultado es: "+ num_res+ "/"+denom_res);
    }
    
    /* 
     * Este método multiplica dos números racionales: 2/3 y 5/4, mostrando por pantalla el resultado
     *
     */
     
    public static void n_racional_producto() {
         
    // Tenemos dos números racionales a=2/3 y b=5/4
         
        int num_res, denom_res; 
         
        int num_a = 2;
        
        int num_b = 5;
        
        int den_a = 3;
        
        int den_b = 4; 
        
        num_res=denom_res = 0;
        
        System.out.println("El resultado es: "+ num_res+ "/"+denom_res);
    }
      
     /* 
     * Este método divide dos números racionales: 2/3 y 5/4, mostrando por pantalla el resultado
     *
     */
     
    public static void n_racional_division() {
         
    // Tenemos dos números racionales a=2/3 y b=5/4
         
        int num_res, denom_res; 
         
        int num_a = 2;
        
        int num_b = 5;
        
        int den_a = 3;
        
        int den_b = 4; 
        
        num_res=denom_res = 0;
        
        num_res=num_a*den_b;
        
        denom_res = num_b*den_a;
        
        System.out.println("El resultado es: "+ num_res+ "/"+denom_res);
    }
    
     /* 
     * Este método suma dos números complejos: 2+3i y b=5+4i, mostrando por pantalla el resultado
     *
     */
    
    public static void n_complejo_suma() {
         
    // Tenemos dos números complejos a=2+3i y b=5+4i
         
        int res_real, res_imag; 
         
        int a_real = 2;
        
        int a_imaginario = 3;
        
        int b_real = 5;

        int b_imaginario = 4; 
        
        res_real = res_imag = 0;
        
        System.out.println("El resultado es: "+ res_real+ "+"+res_imag + "i");
    }
    
      /* 
     * Este método resta dos números complejos: 2+3i y b=5+4i, mostrando por pantalla el resultado
     *
     */
    
    public static void n_complejo_resta() {
         
    // Tenemos dos números complejos a=2+3i y b=5+4i
         
        int res_real, res_imag; 
         
        int a_real = 2;
        
        int a_imaginario = 3;
        
        int b_real = 5;

        int b_imaginario = 4; 
        
        res_real = res_imag = 0;
        
        System.out.println("El resultado es: "+ res_real+ "+"+res_imag + "i");
    }
    
      /* 
     * Este método multiplica dos números complejos: 2+3i y b=5+4i, mostrando por pantalla el resultado
     *
     */
    
    public static void n_complejo_producto() {
         
    // Tenemos dos números complejos a=2+3i y b=5+4i
         
        int res_real, res_imag; 
         
        int a_real = 2;
        
        int a_imaginario = 3;
        
        int b_real = 5;

        int b_imaginario = 4; 
        
        res_real = res_imag = 0;
        
        System.out.println("El resultado es: "+ res_real+ "+"+res_imag + "i");
    }
    
      /* 
     * Este método calcula el módulo del número complejo 2+3i
     *
     */
    
    public static void n_complejo_modulo() {
         
    // Tenemos un números complejos a=2+3i 
         
        float modulo=0;
         
        System.out.println("El módulo es: "+modulo);
    }
    
    /* 
     * Programa de prueba en el que se muestra un menú y se llama al procedimiento correspondiente. Finaliza cuando se inserta un 0
     *
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion = -1; 
        
        Scanner sc = new Scanner(System.in);
        
        while (opcion != 0) {
            
            System.out.println("Seleccione la opción que desee. Inserte 0 para terminar");
            
            System.out.println("1. Suma de números racionales");
            
            System.out.println("2. Resta de números racionales");
            
            System.out.println("3. Producto de números racionales");
            
            System.out.println("4. División de números racionales");
            
            System.out.println("5. Suma de números complejos");
            
            System.out.println("6. Resta de números complejos");
            
            System.out.println("7. Producto de números complejos");
            
            System.out.println("8. Módulo de números complejos");
            
            opcion = sc.nextInt();
            
            switch (opcion) {
                
                case 0: 
                    
                    System.out.println("-------------------------------------");
                    
                    System.out.println("-------Programa finalizado-----------");
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                
                case 1: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("-----Suma de números racionales-------");
                    
                    System.out.println("--------------------------------------");
                    
                    n_racional_suma();
                    
                    System.out.println("-------------------------------------");
                                   
                    break;
                    
                case 2: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("-----Resta de números racionales------");
                    
                    System.out.println("--------------------------------------");
                    
                    n_racional_resta();
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                    
                case 3: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("---Producto de números racionales-----");
                    
                    System.out.println("--------------------------------------");
                    
                    n_racional_producto();
                    
                    System.out.println("--------------------------------------");
                    
                    break;
                    
                case 4: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("---División de números racionales-----");
                    
                    System.out.println("--------------------------------------");
                    
                    n_racional_division();
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                    
                case 5: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("---Suma de números complejos----------");
                    
                    System.out.println("--------------------------------------");
                    
                    n_complejo_suma();
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                    
                case 6: 
                          
                    System.out.println("--------------------------------------");
                    
                    System.out.println("---Resta de números complejos---------");
                    
                    System.out.println("--------------------------------------");
                    
                    n_complejo_resta();
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                    
                case 7: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("---Producto de números complejos------");
                    
                    System.out.println("--------------------------------------");
                    
                    n_complejo_producto();
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                    
                case 8: 
                    
                    System.out.println("--------------------------------------");
                    
                    System.out.println("-----Módulo de números complejos------");
                    
                    System.out.println("--------------------------------------");
                    
                    n_complejo_modulo();
                    
                    System.out.println("-------------------------------------");
                    
                    break;
                                        
                default: 
                    
                    System.out.println("Opción errónea");
            }           
        }
    }
    
}
