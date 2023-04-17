import java.util.Scanner;

public class RecebendoNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rep = 0;
        double num=0;
        boolean verd=true;
        do {
            System.out.print("Digite a quantidade de repeticoes: ");
            if (input.hasNextInt()) {
                rep = input.nextInt();
                verd=false;
            } else {
                System.out.println("Voce digitou letra");
            }
            input.nextLine();
        }while(verd);
        for (int i = 0; i < rep; i++) {
            do {
                verd=true;
                System.out.print("Digite um numero: ");
                if (input.hasNextDouble()) {
                    num = input.nextDouble();
                    verd=false;
                } else {
                    System.out.println("Voce digitou letra");
                }
                input.nextLine();
            }while(verd);
                if (num > 0) {
                    System.out.println("O numero " + num + " e positivo");
                } else if (num < 0) {
                    System.out.println("O numero " + num + " é   negativo");
                } else {
                    System.out.println("O numero é 0!");
                }
            }
        }
    }
