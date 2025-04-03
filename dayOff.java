import java.time.LocalDate;
import java.util.Scanner;

public class dayOff {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

    int diaAtual = LocalDate.now().getDayOfMonth();
    int mesAtual = LocalDate.now().getMonthValue();

    System.out.println("Informe a quantidade de funcionários: ");
    int funcionarios = ler.nextInt();

    int cont = 1;

    for ( cont = 1; cont <= funcionarios; cont++ ){

        System.out.println("Informe o mês do seu aniversário: ");
        int mes = ler.nextInt();

        System.out.println("Informe o dia do seu aniversário: ");
        int dia = ler.nextInt();

        if ( mes == mesAtual && dia >= diaAtual ){
            System.out.println("Funcionário " + cont + " Mês niver: " + mes);
            System.out.println("Funcionário " + cont + " Dia niver: " + dia );
            System.out.println("Funcionário " + cont + " Vai tirar folga no dia " + dia  );

        }

        else if ( mes == mesAtual && dia != diaAtual ){
            System.out.println("Funcionário " + cont + " Mês niver: " + mes);
            System.out.println("Funcionário " + cont + " Dia niver: " + dia );
            System.out.println("Funcionário " + cont + " Já tirou folga no dia" + dia  );

        }

        else if ( mes != mesAtual  ){
            System.out.println("Funcionário " + cont + " Mês niver: " + mes);
            System.out.println("Funcionário " + cont + " Dia niver: " + dia );
            System.out.println("Funcionário " + cont + " Esse mês vai trabalhar todos os dias." );

        }


    }














    }
}