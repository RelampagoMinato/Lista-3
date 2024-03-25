import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.next();
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);

    }

}
