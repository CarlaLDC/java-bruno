import java.util.Scanner;

public class orcamento {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o total de Ganhos: ");
        int ganhos = leitor.nextInt();

        System.out.println("Informe o total de Gastos: ");
        int gastos = leitor.nextInt();

        double porcentagemGastos =  ( gastos * 100 ) / ganhos;

        if ( gastos > ganhos ) {
            System.out.println("Orçamento comprometido! Hora de rever seus gastos!");
        }

        else if ( porcentagemGastos >= 81 && porcentagemGastos <= 100 ) {
            System.out.println("Cuidado, seu orçamento pode ficar comprometido!");
        }

        else if ( porcentagemGastos >= 51 && porcentagemGastos <= 80 ) {
            System.out.println("Atenção, melhor conter os gastos!");
        }

        else if ( porcentagemGastos >= 21 && porcentagemGastos <= 50 ) {
            System.out.println("Muito bem, seus gastos não ultrapassam metade dos ganhos");
        }
        
        else if ( porcentagemGastos >= 0 && porcentagemGastos <= 20 ) {
            System.out.println("Parabéns, está gerenciando bem seu orçamento");
        }

    }
}
