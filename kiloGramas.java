    
import java.util.Scanner;

class Main {
   
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
   
       System.out.println("Informe o kilo?");
       int kilo = ler.nextInt();

       int resultado = kilo * 1000 ;
   
       System.out.println("O kilo para gramas é " + resultado);
   
       }
    }
