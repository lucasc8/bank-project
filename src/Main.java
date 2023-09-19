import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank santander = new Bank("0001");
        Account account = new Account("","");

        boolean continua = true;
        while(continua) {
            System.out.println("Digite C para criar conta, D para depositar e S para sacar um valor e X para sair");
            Scanner scan = new Scanner(System.in);
            String ife = scan.nextLine();
            if (ife.equals("c")) {
                System.out.println("Informe o seu nome: ");
                String name = scan.nextLine();
                santander.generateAccount(name);
                System.out.println(name+" você tem "+account.getBalance()+"  conta "+ santander.getAgc() +" / "+ santander.getCc());
            } else if (ife.equals("d")) {
                System.out.println("Informe o valor a ser depositado: ");
                double value = scan.nextDouble();
                account.deposit(value);
                System.out.println("Você tem "+account.getBalance()+" disponivel na sua conta agora");
            } else if (ife.equals("s")) {
                System.out.println("Informe o valor a ser sacado: ");
                double value = scan.nextDouble();
                account.withdraw(value);
                System.out.println("Você tem "+account.getBalance()+" disponivel na sua conta agora");
            } else if (ife.equals("x")) {
                continua = false;
            } else {
                System.out.println("Valor nao aceito, tente novamente!");
            }
        }
    }
}