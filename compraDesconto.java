import java.util.Scanner;

public class compraDesconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe o total de itens:");
        int itens = ler.nextInt();

        System.out.println("Informe o valor unitário:");
        int unitario = ler.nextInt();

        if ( itens <= 5 ) {
            int conta = itens * unitario;

            System.out.println("Total sem desconto: " + "R$" + conta + ",00" );
            System.out.println("Desconto aplicado: R$0,00"  );
            System.out.println("Valor final: " +"R$" + conta + ",00" );
        }

        else if ( itens >= 6 && itens < 10 ){
            int conta = itens * unitario;
            int desconto = conta - 50; 

            System.out.println("Total sem desconto: " + conta  );
            System.out.println("Desconto aplicado: R$50,00"    );
            System.out.println("Valor final: " + "R$" + desconto + ",00" );
        }

        else if ( itens >= 10 ){
            int conta = itens * unitario;
            int desconto = conta - 100; 

            System.out.println("Total sem desconto: " + "R$" + conta + ",00" );
            System.out.println("Desconto aplicado: R$100,00"    );
            System.out.println("Valor final: " + "R$" + desconto + ",00"  );
        }

    }
}
