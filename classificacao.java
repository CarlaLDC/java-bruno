import java.util.Scanner;

public class classificacao {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe as tres notas:");
        double notaUm = leitor.nextDouble();
        double notaDois = leitor.nextDouble();
        double notaTres = leitor.nextDouble();

        double media = ( notaUm + notaDois + notaTres ) / 3;
        
        System.out.println("Informe a quantidade de faltas:");
        int faltas = leitor.nextInt();

        if ( faltas > 30 ){
            System.out.println("Situação do Aluno: Reprovado");
        }

        else if ( media >= 8){
            System.out.println("Situação do Aluno: Aprovado com Sucesso");
        }

        else if ( media >= 6 && media < 8 ){
            System.out.println("Situação do Aluno: Aprovado");
        }

        else if ( media >= 3 && media < 6 ){
            System.out.println("Situação do Aluno: Recuperação");
        }

        else if ( media < 3){
            System.out.println("Situação do Aluno: Reprovado");
        }

        else {
            System.out.println("Desistente");
        }


    }
}
