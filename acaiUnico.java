    
import java.util.Scanner;

class Main {
   
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
   
       System.out.println("Informe quantos açaí serão?");
       int acai = ler.nextInt();

       double resultado = 13.50 * acai;
   
       System.out.println("Total a pagar é " + resultado);
   
       }
   
   
}
