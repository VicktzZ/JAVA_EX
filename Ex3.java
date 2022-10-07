// Faça um programa que pegue o nome de 3 cartões e seus saldos e exiba o saldo de cada um + a média dos saldos
import java.util.Scanner;

/**
 * Ex3
 */
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cartoes = new String[3];
        double[] saldos = new double[3];
        
         for (int i = 0; i < cartoes.length; i++) {
            System.out.println("digite seus cartoes:");
            cartoes[i] = sc.nextLine();

        }

        for (int i = 0; i < saldos.length; i++) {
            System.out.println("digite seus saldos:");
             saldos[i] = sc.nextDouble();
        }
        System.out.println(String.format("A média é: %s", ( saldos[0] + saldos[1] + saldos[2] / 3 )));
    }
}
