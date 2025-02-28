   
import java.util.Scanner;

class Main {
   
   public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
   
       System.out.println("Informe o valor total da compra?");
       int compra = ler.nextInt();

       System.out.println("Informe o total de parcelas");
       int parcelas = ler.nextInt();
   
       int resultado =  compra / parcelas ;
   
       System.out.println("Sua compra deu " + compra + " em " + parcelas + " de R$ "  + resultado + " foi concluida");
   
       }
    }
