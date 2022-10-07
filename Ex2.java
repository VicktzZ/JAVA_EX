import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litro = 12;
        System.out.println("Digite o percurso:");
        int percurso = sc.nextInt();
        System.out.println(percurso / litro);

    }
}
