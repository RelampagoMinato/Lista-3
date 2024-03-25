
//Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a
//distância total percorrida pelo automóvel e o total de combustível gasto.
import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a distância total percorrida pelo automóvel: ");
        double distância = leitor.nextDouble();

        System.out.println("Digite a quantidade em litros de combustível gasto: ");
        double combustível = leitor.nextDouble();

        double médio = distância / combustível;

        System.out.println("O consumo médio é: " + médio);

    }
}
