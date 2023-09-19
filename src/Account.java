import java.util.ArrayList;
import java.util.List;
public class Account {
    private String agc;
    private String cc;
    private String name;
    private double balance = 0;

    public Account(String name,String cc){
        this.name = name;
    }

    public String getName(){
     return name;
    }
    public String getAgc(){
        return agc;
    }
    public String getCc(){
        return cc;
    }

    public double getBalance(){
        return balance;
    }

    public double withdraw(double value){
        if (balance >= value){
            balance =- value;
            return balance;
        }else {
            System.out.println("Valor inaceitavel!");
            return balance;
        }
    }
    public double deposit(double value){
        balance =+ value;
        return balance;
    }
}
