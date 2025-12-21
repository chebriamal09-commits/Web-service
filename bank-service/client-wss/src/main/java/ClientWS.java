import proxy.Account;
import proxy.BanckAccountService;
import proxy.BankWS;

public class ClientWS {
    public static void main(String[] args) {
        BanckAccountService proxyWs = new BankWS() .getBanckAccountServicePort();
        System.out.println(proxyWs.conversionEuroToDh(800));
        Account account = proxyWs.getAccount(3);
        System.out.println("------------------");
        System.out.println(account.getCode());
        System.out.println(account.getBalance());
        System.out.println(account.getCreationDate());
    }
}
