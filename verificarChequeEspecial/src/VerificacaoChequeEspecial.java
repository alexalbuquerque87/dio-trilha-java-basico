import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo:");
        double saldo = scanner.nextDouble();
        
        System.out.println("Informe o saque:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            //Verificar se o saque ultrapassa o limite do cheque especial
            if (saldo + limiteChequeEspecial >= saque) {
                // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
