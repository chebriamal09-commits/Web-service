package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8085/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Serveur JAX-WS demarre sur : " + url);
        System.out.println("WSDL : " + url + "?wsdl");
    }
}
