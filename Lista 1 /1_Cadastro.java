import java.util.Date;
import java.util.Scanner;

//Solicite os dados para uma vaga de emprego:
/* Nome, Sobrenome, data de nascimento, pretensão salarial, grau de instrução (ensino médio, técnico ou superior),
cargo pretendido e CNH B (sim ou não). Após inserir os dados, exiba todos os dados solicitados e confirme o cadastro.
 */
public class Cadastro {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo! Informe seus dados abaixo: \n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Insira sua data de nascimento(Ex: 01/01/2000): ");
        String dataString = scanner.nextLine();

        System.out.println("Insira sua pretensão salarial(R$): ");
        Double pretensaoSalarial = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Insira seu grau de instrução: ");
        String grauInstrucao = scanner.nextLine();

        System.out.println("Você possui CNH B? ");
        String chn = scanner.nextLine();

        System.out.println("Os dados inseridos foram: \n");
        System.out.println("============================================");
        System.out.printf("Nome Completo: %s %s \n", nome,sobrenome);
        System.out.println("Data de nascimento: " + dataString);
        System.out.println("Pretensão Salarial: " + pretensaoSalarial);
        System.out.println("Grau de instrução: " + grauInstrucao);
        System.out.println("Possui CNH? " + chn);
        System.out.println("============================================\n");
        System.out.println("Dados cadastrados com sucesso!");
    }
}
