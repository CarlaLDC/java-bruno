import java.util.Scanner;

public class paresArray {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    System.out.println("Informe a quantidade de números:");
    int qtd = ler.nextInt();

    int[] vetorNumeros = new int[qtd];
    int[] vetorPares = new int[qtd];

    for ( int i = 0; i < vetorNumeros.length; i++ ){
        vetorNumeros[i] = ler.nextInt();

        if ( vetorNumeros[i] % 2 == 0 ){
            vetorPares[i] = vetorNumeros[i];
        }

    }

    System.out.println("Você digitou os números: ");    

    for ( int item : vetorNumeros ){
        System.out.println(item);
    }

    System.out.println("Os números pares são: ");    

    for ( int item : vetorPares ){
        System.out.println(item);
    }

    }
    
}
