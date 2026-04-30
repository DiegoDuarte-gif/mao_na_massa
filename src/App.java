import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        boolean resultado = ehPar(num);
        if (resultado == true) {
            System.out.println("Esse número é par!");}
            else {System.out.println("Esse número é ímpar!");
        }
     scanner.close();
    }
    public static boolean ehPar(int num){
        return (num %2==0);
        }
    }