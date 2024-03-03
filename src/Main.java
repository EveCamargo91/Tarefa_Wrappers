
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite sua idade: ");
        Integer idade = Integer.valueOf(scanner.nextLine());


        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade + " anos");


        scanner.close();
    }
}



