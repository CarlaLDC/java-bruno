import java.util.Scanner;

class Main {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("Informe quantos açaí pequenos serão?");
        int acaiP = ler.nextInt();

        System.out.println("Informe quantos açaí medio serão?");
        int acaiM = ler.nextInt();

        System.out.println("Informe quantos açaí grande serão?");
        int acaiG = ler.nextInt();
 
        double resultado = (13.50 * acaiP) + (15.00 * acaiM) + (17.50 * acaiG);
    
        System.out.println("Total a pagar é " + resultado);
    
        }
    
    
 }
 