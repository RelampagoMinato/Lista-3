
//Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um
//valor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também a
//quantidade de dólares disponíveis com o usuário.
import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a cotação do dólar: ");
        double cotação = leitor.nextDouble();
        System.out.println("Informe a quantidade de dólares disponíveis: ");
        double quantidade = leitor.nextDouble();

        double totalReais = cotação * quantidade;

        System.out.println("Após a conversão você terá a quantia total de R$ " + totalReais);

    }
}