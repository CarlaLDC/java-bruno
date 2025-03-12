import java.util.Scanner;

public class corResultante {
    public static void main(String[] args){
     Scanner leitor = new Scanner(System.in);

    System.out.println("Informe duas cores:");
     String primeiraCor = leitor.next();
     String segundaCor = leitor.next();

    if ( primeiraCor == "Vermelho" && segundaCor == "Vermelho"  ) {
        System.out.println("A combinação das cores: Vermelho");
    }

    else if ( primeiraCor == "Amarelo" && segundaCor == "Amarelo"  ) {
        System.out.println("A combinação das cores: Amarelo");
    }

    else if ( primeiraCor == "Azul" && segundaCor == "Azul"  ) {
        System.out.println("A combinação das cores: Azul");
    }

    else if ( primeiraCor == "Azul" && segundaCor == "Amarelo"  ) {
        System.out.println("A combinação das cores: Verde");
    }

    else if ( primeiraCor == "Vermelho" && segundaCor == "Amarelo"  ) {
        System.out.println("A combinação das cores: Laranja");
    }

    else if ( primeiraCor == "Azul" && segundaCor == "Vermelho"  ) {
        System.out.println("A combinação das cores: Roxo");
    }


    else {
        System.out.println("Apenas cores primárias são aceitas.");
    }





    }
}


