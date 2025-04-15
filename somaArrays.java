import java.util.Scanner;

public class somaArrays {
        public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe a quantidade de números:");
        int qtd = ler.nextInt();

        int[] vetorNumeros = new int[qtd];
        int[] vetorNumerosDois = new int[qtd];

        for ( int repetir = 0; repetir < vetorNumeros.length; repetir++ ){
            System.out.println("Informe os números:");
            vetorNumeros[repetir] = ler.nextInt();
        }
        
        for ( int contDois = 0; contDois < vetorNumerosDois.length; contDois++ ){
            System.out.println("Informe os números:");
            vetorNumerosDois[contDois] = ler.nextInt();

        }
        
        int[] vetorTres = new int[qtd];

        for ( int soma = 0; soma < vetorTres.length; soma++ ){
            vetorTres[soma] = vetorNumeros[soma] + vetorNumerosDois[soma];
        }

        System.out.println("Primeiro vetor: ");

        for ( int item : vetorNumeros ){
            System.out.println(item);
        }

        System.out.println("Segundo vetor: ");

        for ( int item : vetorNumerosDois ){
            System.out.println(item);
        }

        System.out.println("A soma dos dois vetores é: ");
        for ( int item : vetorTres ){

            if ( vetorTres == vetorTres ){
                System.out.println(item);
                break;
            }

        }


    }
    
}
