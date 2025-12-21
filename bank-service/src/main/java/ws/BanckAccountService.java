package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

import java.util.Date;

@WebService(serviceName = "BankWS")
public class BanckAccountService {

    @WebMethod(operationName = "ConversionEuroToDh")
    public double convertToDh(@WebParam(name = "montant") double amount) {
        return amount * 11;
    }

    @WebMethod
    public Account getAccount(@WebParam(name = "code") int code) {
        return new Account(code, 43000, new Date());
    }

    @WebMethod
    public List<Account> listAccounts() {
        return List.of(
                new Account(1, 4300, new Date()),
                new Account(2, 1200, new Date()),
                new Account(3, 3300, new Date())
        );
    }

}
