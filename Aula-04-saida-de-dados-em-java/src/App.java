public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!"); // Quebra ao final da linha
        System.out.print("Good Day"); // Não quebra ao final da linha
        System.out.printf("%.2f%n", 500.6542); /* Formata o numero de ponto flutuante com a
        quantidade de casas desejadas no caso o %.2f indica duas casas, e o %n indica uma quebra de linha. */
        System.out.printf("RESULTADO = %.2f metros%n", 200.255); // Aqui o %.2f irá ser subistituido pelo segundo parametros.

        String NOME = "Maria";
        int IDADE = 20;
        double RENDA = 4000.0;

        System.out.printf("%s tem %d e ganha %.2f", NOME, IDADE, RENDA);

        /*
        * Marcadores
        * %d - representa números inteiros
        * %f - representa números floats
        * %2f - representa números doubles
        * %b - representa valores booleanos
        * %c - representa valores char
        */
    }
}
