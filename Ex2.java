import java.util.Scanner; // Importação do pacote "Scanner"

public class Ex2 { // Criação da classe "Ex 2"
    public static void main(String[] args) { // Inicialização do método "main"
        Scanner sc = new Scanner(System.in); // Instanciação do "Scanner"
        int combustivel = 12; // Inicialização da variável "combustivel" do tipo inteiro
        System.out.println("Digite a distância do percurso (KM):"); // Pergunta ao usuário
        int percurso = sc.nextInt(); // Entrada do usuário
        System.out.println(String.format("Serão necessários: %s litros", percurso/combustivel)); // Saída do programa
    }
}
