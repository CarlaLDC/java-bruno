import java.util.Scanner;

public class semanaArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número: ");
    int semana = ler.nextInt();

    String[] semanaArray = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

    String semanas = semanaArray[semana];

    System.out.println(semanas);
    }
}
