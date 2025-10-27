import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe scanner

       //Exibir as mensagens para o usuário

       //Obter pela classe scanner os valores digitados pelo terminal

       //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);
        Double saldo = 237.48;

        
        
        System.out.println("Informe seu nome:");
        String nome = scanner.next();

        System.out.println("Informe seu sobreome:");
        String sobrenome = scanner.next();

        System.out.println("Informe o número da agência:");
        String agencia = scanner.next();

        System.out.println("Informe o número da conta:");
        int numeroConta = scanner.nextInt();

        

        System.out.println("Olá " + nome +  " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta bancaria "+ numeroConta + " e seu saldo de " + saldo + "  já está disponível para saque");


    }
}
