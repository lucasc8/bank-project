import javax.swing.*;
import java.util.*;

public class Bank {
    private String agc;
    private List<Account> accounts;
    private String cc;
    private int ccAtual = 1;

    public Bank(String agc) {
        this.agc = agc;
        this.accounts = new ArrayList<Account>();

    }

    public String getAgc(){
        return agc;
    }
    public String getCc(){
        return cc;
    }

    public Account generateAccount(String name){
        Account account = new Account(name, ""+ccAtual);
        cc = ccAtual+"";
        ccAtual++;
        return account;
    }
}
