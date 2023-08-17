import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 0.0;

    System.out.println("Por favor digite o número da sua conta!");
    int numero = scanner.nextInt();
    System.out.println("Por favor digite o número da sua agência!");
    String agencia = scanner.next();
    System.out.println("Por favor digite o seu nome completo!");
    String nomeCliente = scanner.next();
    System.out.println("Por favor digite o valor do seu depósito inicial!");
    saldo = scanner.nextDouble();

    String resposta = "Olá "
        .concat(nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(agencia)
        .concat(", conta ")
        .concat(Integer.toString(numero))
        .concat(" e seu saldo ")
        .concat(Double.toString(saldo))
        .concat(" já está disponível para saque");

    System.out.println(resposta);
  }
}
