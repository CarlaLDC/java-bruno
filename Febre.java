import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual temperatura você está?");
        double temperatura = ler.nextDouble();

        boolean resultado = temperatura >= 37;

        System.out.println( resultado);

    }



}