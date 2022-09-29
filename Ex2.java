import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel = 12;
        
        System.out.println("Digite a distância do percurso (KM):");
        int percurso = sc.nextInt();

        System.out.println(String.format("Serão necessários: %s litros", percurso/combustivel));
    }
}
