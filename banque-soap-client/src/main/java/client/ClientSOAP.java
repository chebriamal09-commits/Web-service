package client;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class ClientSOAP {
    public static void main(String[] args) {
        BanqueWS service = new BanqueWS();
        BanqueService proxy = service.getBanqueServicePort();

        double resultat = proxy.conversionEuroToDH(100);
        System.out.println("100 Euro en DH = " + resultat);

        Compte compte = proxy.getCompte(1L);
        System.out.println("Compte consulte :");
        System.out.println("Code : " + compte.getCode());
        System.out.println("Solde : " + compte.getSolde());
        System.out.println("Date creation : " + compte.getDateCreation());

        System.out.println("Liste des comptes :");
        List<Compte> comptes = proxy.listComptes();
        for (Compte c : comptes) {
            System.out.println(c.getCode() + " | " + c.getSolde() + " | " + c.getDateCreation());
        }
    }
}
