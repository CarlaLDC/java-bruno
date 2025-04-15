import java.util.Scanner;

public class mesesArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe um número: ");
    int mes = ler.nextInt();
    
    String[] mesesArray = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    
    String meses = mesesArray[mes];

    System.out.println(meses);

    }
    
}