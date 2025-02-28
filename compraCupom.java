    
import java.util.Scanner;

 class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe o valor total da compra?");
        int compra = ler.nextInt();

        System.out.println("Informe o valor do cupom");
        int cupom = ler.nextInt();
    
        int resultado = compra-cupom;
    
        System.out.println("Compra finalizada! O valor tota é " + resultado);
    
        }
    
    
}


