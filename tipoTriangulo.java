import java.util.Scanner;

class tipoTriangulo {
    
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe os tres lados:");
        double ladoA = leitor.nextDouble();
        double ladoB = leitor.nextDouble();
        double ladoC = leitor.nextDouble();

        if ( ladoA == ladoB && ladoC == ladoB && ladoA == ladoC ){
            System.out.println("Triângulo Equilátero");
        }

        else if ( ladoA != ladoB && ladoC != ladoB && ladoA != ladoC ){
            System.out.println("Triângulo Escaleno");
        }

        else {
            System.out.println("Triângulo Isósceles");
        }




    }
    
}