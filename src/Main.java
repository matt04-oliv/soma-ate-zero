import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.println("Digite um número (0 para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("A soma total dos números digitados é: " + soma);
        scanner.close();
    }
}
