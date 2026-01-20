import java.util.Scanner;

public class ColisaoTrens {

        static final double LimiteKM = 10000;
        static final double LimiteVel = 300;

        public static void main(String[] args) {

            Scanner scanner =  new Scanner(System.in);
            boolean repetir;

            do {
                double posicaoA = lerPosicao (scanner, "Posição do trem A (km): ");
                double posicaoB = lerPosicao (scanner, "Posição do trem B (km): ");

                double velocidadeA = lerVelocidade(scanner, "Velocidade do trem A (km/h): ", true);
                double velocidadeB = lerVelocidade(scanner, "Velocidade do trem B (km/h): ", false);

                if (velocidadeB - velocidadeA == 0){
                    System.out.println("Os trens não irão colidir");
                }

                else {
                    double tempoHoras = (posicaoA - posicaoB) / (velocidadeB - velocidadeA);

                    if (tempoHoras <= 0){
                        System.out.println("Os trens não irão colidir");
                    }
                    else {
                        double tempoSegundos = tempoHoras * 3600;
                        double posicaoColisao = posicaoA + velocidadeA * tempoHoras;

                        String horario = calcularHorario(tempoSegundos);

                        System.out.printf( "A colisão de trens acontecerá no KM %.2f e ocorrerá após %.0f segundos no horário de %s%n",
                                posicaoColisao, tempoSegundos, horario
                        );
                    }
                }

                System.out.print("Deseja executar novamente? (s/n): ");
                repetir = scanner.next().equalsIgnoreCase("s");
            } while (repetir);

            System.out.println("Fim do programa");
            scanner.close();
        }

    static double lerPosicao(Scanner scanner, String msg) {
        double valor;
        do {
            System.out.print(msg);
            valor = scanner.nextDouble();
            if (valor < 0 || valor > LimiteKM) {
                System.out.println("Erro: posição deve estar entre 0 e 10.000 km.");
            }
        } while (valor < 0 || valor > LimiteKM);
        return valor;
    }

    static double lerVelocidade(Scanner scanner, String msg, boolean positiva) {
        double valor;
        do {
            System.out.print(msg);
            valor = scanner.nextDouble();

            if (Math.abs(valor) > LimiteVel ||
                    (positiva && valor <= 0) ||
                    (!positiva && valor >= 0)) {

                System.out.println("Erro: velocidade inválida.");
            }

        } while (Math.abs(valor) > LimiteVel ||
                (positiva && valor <= 0) ||
                (!positiva && valor >= 0));

        return valor;
    }

    static String calcularHorario(double segundos) {
        int total = (int) segundos;
        int horas = 17 + total / 3600;
        int minutos = (total % 3600) / 60;
        int seg = total % 60;

        horas %= 24;

        return String.format("%02d:%02d:%02d", horas, minutos, seg);
    }
}


