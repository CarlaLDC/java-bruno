import java.util.Scanner;

class candidato {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a sua nota:");
        double nota = leitor.nextDouble();

        System.out.println("Informe a nota de corte:");
        double corte = leitor.nextDouble();

        System.out.println("Informe a nota mínima:");
        double minima = leitor.nextDouble();

        if ( nota < corte ){
            System.out.println("Candidato não passou.");
        }

        else if ( nota >= minima ){
            System.out.println("Candidato aprovado.");
        }

        else {
            System.out.println("Candidato está na lista de espera.");
        }




    }
    
}