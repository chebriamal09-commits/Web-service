import jakarta.xml.ws.Endpoint;
import ws.BanckAccountService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8686/";
        Endpoint.publish(url, new BanckAccountService());
        System.out.println("Web service déployé sur " + url);
    }
}
