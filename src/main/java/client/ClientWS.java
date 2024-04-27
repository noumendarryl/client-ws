package client;

import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

import java.util.List;

public class ClientWS {

    public static void main(String[] args) {
        BankService proxy = new BankWS().getBankServicePort();
        System.out.println(proxy.convertEuroToDH(9000));
        Account account = proxy.getAccount(9);
        System.out.println("------------------------------------");
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        List<Account> accounts = proxy.listAccounts();
        accounts.forEach(cp -> {
            System.out.println("---------------------------------");
            System.out.println(cp.getCode());
            System.out.println(cp.getBalance());
        });
    }

}
