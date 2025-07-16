import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); // Criei a classe Scanner para a entrada de dados

       System.out.println("Olá, vamos fazer o seu cadastro no banco!");

       System.out.println("Por favor, digite o número Agência: ");
       int number = entrada.nextInt(); // O usuário digita no terminal

       System.out.println("Qual é a sua Agência: ");
       entrada.nextLine();  // Não deixa o \n do nextInt entrar no nextLine, não pula o nextLine
       String agencia = entrada.nextLine();

       System.out.println("Digite seu nome: ");
       String name = entrada.nextLine();
       name = name.toUpperCase(); // Deixa o nome do cliente em maiúsculo

       System.out.println("Digite o seu saldo: ");
       double saldo = entrada.nextDouble();
       entrada.close(); // Fecha o Scanner, boa prática

       System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", name, agencia, number, saldo);
    }
}
