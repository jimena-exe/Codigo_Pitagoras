
package pitagoras;

import java.util.Scanner; //librería


public class Pitagoras {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a calcular la hipotenusa");
        System.out.println("Ingrese el valor del cateto 1: ");
        double cat1 = leer.nextInt();
        System.out.println("Ingrese el valor del cateto 2: ");
        double cat2 =leer.nextInt();
        double h = Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2, 2));
        System.out.println("La hipotenusa es: " + h);
        
           
    
    }
    
}
