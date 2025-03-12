import java.util.Scanner;

public class mensalidade {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
    
    System.out.println("Informe sua sigla:");
    String sigla = leitor.next();

    System.out.println("É isento? ");
    boolean isento = leitor.nextBoolean();

    System.out.println("Informe seu desconto:");
    double desconto = leitor.nextDouble();
    
    if ( sigla.equals("SI") ) {

        if ( isento == true ) {
            System.out.println("Sua mensalidade é R$0,00");
        }
        
        else if ( desconto == 0 ) {
            System.out.println("Sua mensalidade é R$550,00");
        }

        else if ( desconto > 0 ) {
            double resultado = ( desconto / 100 ) * 550;

            System.out.println("Sua mensalidade é R$ " + resultado);
        }

    }

    else if ( sigla.equals("ADS") ) {

        if ( isento == true ) {
            System.out.println("Sua mensalidade é R$0,00");
        }
        
        else if ( desconto == 0 ) {
            System.out.println("Sua mensalidade é R$750,00");
        }

        else if ( desconto > 0 ) {
            double resultado = ( desconto / 100 ) * 750;

            System.out.println("Sua mensalidade é R$ " + resultado);
        }
     
    }
    
    else if ( sigla.equals("CS") ) {

        if ( isento == true ) {
            System.out.println("Sua mensalidade é R$0,00");
        }
        
        else if ( desconto == 0 ) {
            System.out.println("Sua mensalidade é R$1.150,00");
        }

        else if ( desconto > 0 ) {
            double resultado = ( desconto / 100 ) * 1150;

            System.out.println("Sua mensalidade é R$ " + resultado);
        }

    }

    else if ( sigla.equals("EC") ) {

        if ( isento == true ) {
            System.out.println("Sua mensalidade é R$0,00");
        }
        
        else if ( desconto == 0 ) {
            System.out.println("Sua mensalidade é R$1.300,00");
        }

        else if ( desconto > 0 ) {
            double resultado = ( desconto / 100 ) * 1300;

            System.out.println("Sua mensalidade é R$ " + resultado);
        }

    }

    else if ( sigla.equals("ES") ) {

        if ( isento == true ) {
            System.out.println("Sua mensalidade é R$0,00");
        }        
        
        else if ( desconto == 0 ) {
            System.out.println("Sua mensalidade é R$950,00");
        }

        else if ( desconto > 0 ) {
            double resultado = ( desconto / 100 ) * 950;

            System.out.println("Sua mensalidade é R$ " + resultado);
        }
    }
    
    
    }
   
}
