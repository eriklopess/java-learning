import java.util.Locale;
import java.util.Scanner; // Importação do scanner

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in); // Implementando o sc no código

        System.out.println("Digite uma String");
        String x;
        x = sc.next(); // Irá pedir uma palavra no input
        System.out.println("Você digitou: " + x);

        System.out.println("Digite um int");
        int y;
        y = sc.nextInt(); // Pede um numero inteiro
        System.out.println("Você digitou: " + y);

        System.out.println("Digite um double");
        double z;
        z = sc.nextDouble(); // Pede um numero inteiro
        System.out.println("Você digitou: " + z);

        System.out.println("Digite um char");
        char a;
        a = sc.next().charAt(0); // Pega o primeiro caracter
        System.out.println("Você digitou: " + a);

        sc.close(); // Usado quando não precisamos do mais do objeto.
    }
}
