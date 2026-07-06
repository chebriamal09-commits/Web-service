package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversionEuroToDH(double montant) {
        return montant * 11;
    }

    @WebMethod(operationName = "GetCompte")
    public Compte getCompte(Long code) {
        return new Compte(code, Math.random() * 10000, new Date());
    }

    @WebMethod(operationName = "ListComptes")
    public List<Compte> listComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1L, 8000, new Date()));
        comptes.add(new Compte(2L, 6500, new Date()));
        comptes.add(new Compte(3L, 12000, new Date()));
        return comptes;
    }
}
