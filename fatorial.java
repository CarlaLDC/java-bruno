import java.util.Scanner;

public class fatorial{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);

        System.out.println("Informe um número: ");
        int numero = ler.nextInt();

        int soma = 1;

        for ( int i = 1; i <= numero; i++ ){
            soma = soma * i;
        }

        System.out.println("O fatorial é: " + soma);
	
	    
		
	}
}
