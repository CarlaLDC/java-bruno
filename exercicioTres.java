import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Informe o total de Ganhos: ");
        int ganhos = leitor.nextInt();

        System.out.println("Informe o total de Gastos: ");
        int gastos = leitor.nextInt();

        if ( gastos >= ganhos) {
            System.out.println("Você está fora do orçamento! Não gaste mais!");
        }

        else {
            System.out.println("Você está dentro do orçamento!");
        }

    }
}