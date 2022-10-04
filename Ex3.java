import java.util.Scanner; // Importação da classe Scanner

public class Ex3 { // Criação da classe Ex3
    public static void main(String[] args) { // Inicialização da classe "main"
        Scanner sc = new Scanner(System.in); // Instanciação do "Scanner"
        double media = 0; // Inicialização da varíavel "media" do tipo double

        System.out.println("Insira a quantidade de cartões: "); // Pergunta ao usário quantos cartões existem na família
        int qtd_cartoes = sc.nextInt(); // Entrada do usuário
        System.out.println(); // Pula uma linha

        String[] cartoes = new String[qtd_cartoes]; // Cria um vetor com a quantidade de cartões solicitada
        double[] saldo = new double[qtd_cartoes]; // Cria um vetor contendo os saldos da quantia de cartões solicitadas

        for (int i = 0; i < cartoes.length; i++) { // Cria um laço de repetição válido até o comprimento do vetor "cartões"
            System.out.println(String.format("Digite o nome da conta [%s]:", i+1)); // Pergunta o nome do usuário X da família
            cartoes[i] = sc.next(); // Entrada do usuário

            System.out.println(String.format("Digite o saldo da conta [%s]:", i+1)); // Pergunta o saldo do usuário X da família
            saldo[i] = sc.nextDouble(); // Entrada do usuário

            System.out.println(); //Pula uma linha
        }

        for (int i = 0; i < cartoes.length; i++) { // Cria um laço de repetição válido até o comprimento do vetor "cartões"
            System.out.println(cartoes[i] + ": " + saldo[i]); // Exibe o nome dos cartões e seus respectivos saldos
            media += saldo[i]; // media recebe o valor de todos os saldos do cartão
        }
        System.out.println(); // Pula uma linha
        System.out.println(String.format("A média dos saldos é de R$%s", media/3)); // Exibe a variavel "media" dividida por 3 (Média dos saldos dos cartões)
    }
}
