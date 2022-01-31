import interfaz.AbstractFactory;
import interfaz.IConnexionBD;
import interfaz.IConnexionREST;

public class App {
    public static void main(String[] args) {
        AbstractFactory fabricaBD = FabricaProductor.getFactory("BD");
        IConnexionBD cxBD1 = fabricaBD.getBD("MYSQL");

        cxBD1.conectar();

        AbstractFactory fabricaREST = FabricaProductor.getFactory("REST");
        IConnexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

        cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");

    }
}
