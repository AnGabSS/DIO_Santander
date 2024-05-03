import java.util.Scanner;
import java.math.BigDecimal;

public class ContaTerminal {
    public static void main(String[] args) {

        int number;
        String agency, clientName;
        BigDecimal balance;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Agência: ");
        number = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o nome da sua Agência: ");
        agency = sc.nextLine();
        System.out.println("Por favor, digite o seu nome: ");
        clientName = sc.nextLine();
        System.out.println("Por favor, digite o seu saldo: ");
        balance = sc.nextBigDecimal();
        sc.close();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque");
    }
}
