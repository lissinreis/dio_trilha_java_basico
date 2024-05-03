import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner sc= new Scanner(System.in);
      int numero;
      String agencia;
      String nomeCliente;
      double saldo;

      System.out.println("----CONTA BANCÁRIA----");
      System.out.println();

      System.out.println("Digite o Número da Conta: (1234)");
      numero=sc.nextInt();

      System.out.println("Agora Digite Sua Agência: (123-9)");
      agencia=sc.next();

      System.out.println("Me Informe Seu Nome: ");
      nomeCliente=sc.next();
      sc.nextLine();

      System.out.println("Me Informe Seu Saldo Atual: ");
      saldo=sc.nextDouble();

      System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo %.2f já está disponível"
				+ "para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
    }
}
