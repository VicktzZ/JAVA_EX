import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double contador = 0;

        System.out.println("Insira a quantidade de pessoas: ");
        int qtd_pessoas = sc.nextInt();
        System.out.println();

        String[] pessoas = new String[qtd_pessoas];
        double[] saldo = new double[qtd_pessoas];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(String.format("Digite o nome da conta [%s]:", i+1));
            pessoas[i] = sc.next();

            System.out.println(String.format("Digite o saldo da conta [%s]:", i+1));
            saldo[i] = sc.nextDouble();

            System.out.println();
        }

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i] + ": " + saldo[i]);
            contador += saldo[i];
        }
        System.out.println();
        System.out.println(String.format("A média dos saldos é de R$%s", contador/3));
    }
}
