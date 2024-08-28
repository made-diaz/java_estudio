package semana3.pkg1;

import java.util.Scanner;

/**
 *
 * @author Madeleyne Diaz
 */
public class Semana31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i =  1;
        //while y do while
        //while (i <= 5) {            
        //    System.out.println(i);
        //    i++;
        //}
        //if (i==3){
        //    System.out.println("hola soy el numero tres.");
        //}else{
        //    System.out.println("soy un numero x");
        //}
        //System.out.println(i);
        //i++;
        
        /**System.out.println("ingrese nombre o salir");
        String nombre = scan.nextLine();
        
        
        while (!nombre.equalsIgnoreCase("salir")) {            
            //System.out.println(nombre);
            nombre = scan.nextLine();
        }
        */
        
        /**int acumulador = 0;
        int num;
        
        while (true) {            
            System.out.println("ingrese un numero");
            num = scan.nextInt();
            if(num %2!= 0);
            break;
        }
        acumulador = acumulador + num;
        
        System.out.println("la suma de los numeros anteriormente digitados es; " + acumulador);
        */
        
        /**int numero;
        do{
            System.out.println("ingrese numero");
            numero = scan.nextInt();
        }while (numero >= 0); //2
            System.out.println("fin del programa");
            */
            
            
            try{
                System.out.println("ingrese un numero");
                int num = scan.nextInt();
            }catch (Exception e){
                System.out.println("no es un numero");
            }
    }
    
    
    }
    

