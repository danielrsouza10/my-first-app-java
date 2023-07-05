package daniel.souza.Excessoes;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class TryAndCatch {
    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola me chamo " + nome + ". Tenho " + idade + " anos e " + altura + " cm de altura");
        } 
        catch(InputMismatchException e){
            System.out.println("Os campos de idade e altura precisam ser preenchidos com caracteres num'ericos");
        }
        
    }
}
