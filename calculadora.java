import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);

        System.out.println("Informe dois valores númericos:");
        int valorUm = leitor.nextInt();
        int valorDois = leitor.nextInt();

        System.out.println("Informe a operação matemática:");
        String operação = leitor.next();
        
        if ( operação.equals("Soma") ) {
            int resultado = valorUm + valorDois;
            System.out.println("O resultado é: " + resultado);
        }

        else if ( operação.equals("Subtrção") ) {
            int resultado = valorUm - valorDois;
            System.out.println("O resultado é: " + resultado);
        }

        else if ( operação.equals("Multiplicação") ) {
            int resultado = valorUm * valorDois;
            System.out.println("O resultado é: " + resultado);
        }

        else if ( operação.equals("Divisão") ) {
            int resultado = valorUm / valorDois;
            System.out.println("O resultado é: " + resultado);
        }

        else if ( operação.equals("Resto da Divisão") ) {
            int resultado = valorUm % valorDois;
            System.out.println("O resultado é: " + resultado);
        }

        else if ( operação.equals("Potência") ) {
            double resultado = Math.pow(valorUm,  valorDois);
            System.out.println("O resultado é: " + resultado);
        }
    
    
    
    
    
    
    
    
    }
}
