import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String[] notas = new String[4];

        System.out.println("Insira seu nome");
        String Nome = sc.nextLine();

        System.out.println("Insira sua primeira nota com pontuação, exemplo 9.0");
        notas[0] = sc.nextLine();

        System.out.println("Insira sua segunda nota com pontuação, exemplo 9.0");
        notas[1] = sc.nextLine();

        System.out.println("Insira sua terceira nota com pontuação, exemplo 9.0");
        notas[2] = sc.nextLine();

        System.out.println("Insira sua quarta nota com pontuação, exemplo 9.0");
        notas[3] = sc.nextLine();

        System.out.println("Olá " + Nome + ", estamos calculando sua nota!");

        double NOTAS_SOMADAS = Double.parseDouble(notas[0]) + Double.parseDouble(notas[1]) + Double.parseDouble(notas[2]) + Double.parseDouble(notas[3]);

        double MEDIA = NOTAS_SOMADAS / 4;

        if (MEDIA > 6) {
            System.out.println("Você foi aprovado com " + MEDIA + " pontos");
        } else {
            System.out.println("Você foi reprovado com " + MEDIA + " pontos");
        }
    }
}
