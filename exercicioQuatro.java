import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
    
        System.out.println("Informe o dia da semana: ");
        int semana = leitor.nextInt();

        if ( semana == 0) {
            System.out.println("Domingo");

        }

        else if ( semana == 1) {
            System.out.println("Segunda");

        }

        else if ( semana == 2) {
            System.out.println("Terça");

        }

        else if ( semana == 3) {
            System.out.println("Quarta");

        }

        else if ( semana == 4) {
            System.out.println("Quinta");

        }

        else if ( semana == 5) {
            System.out.println("Sexta");

        }

        else if ( semana == 6) {
            System.out.println("Sábado");

        }

        else {
            System.out.println("Dia da Semana inválido");
        }

    }
}
