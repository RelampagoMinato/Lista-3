
//Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas
//efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
//suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String vendedor = leitor.nextLine();
        System.out.println("Informe o salário fixo: ");
        double salário = leitor.nextDouble();
        System.out.println("Informe o valor total em reais das vendas realizadas: ");
        double vendas = leitor.nextDouble();

        double comissão = (vendas * 0.15);
        double salFinal = salário + comissão;

        System.out.println("Vendedor: " + vendedor);
        System.out.println("Salário fixo: " + salário);
        System.out.println("Salário final: " + salFinal);

    }
}
