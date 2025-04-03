
import java.util.Scanner;

public class contaCorrente {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    System.out.println("Informe o saldo inicial da conta: ");
    int saldoInicial = ler.nextInt();

    System.out.println("Informe o total de saques: ");
    int saque = ler.nextInt();

    int cont = 1;
    int fora = 0;
    int limiteDiario = 1000;

    for ( cont = 1; cont <= saque; cont++ ){

        if ( saque <= saldoInicial && saque <= limiteDiario ){
            System.out.println("Informe o valor do saques: ");
            int valorSaque = ler.nextInt();

            int conta = saldoInicial - valorSaque;

            System.out.println("Valor do saque " + cont + ": " + valorSaque  );
            System.out.println("Saque de R$ " + valorSaque + " autorizado"  );
            System.out.println("Saldo atualizado: R$" + conta );
        
            fora = fora + cont;
        }

        else if ( saque < 0 && saque > limiteDiario ){
            System.out.println("Informe o valor do saques: ");
            int valorSaque = ler.nextInt();

            System.out.println("Valor do saque " + cont + ": " + valorSaque  );
            System.out.println("Saque de R$ " + valorSaque + " negado"  );
            System.out.println("Saldo insuficiente" );

        }

    }

}

}

