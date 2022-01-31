import interfaz.AbstractFactory;
import interfaz.IConnexionBD;
import interfaz.IConnexionREST;
import interfaz.implementacion.ConnexionRESTCompras;
import interfaz.implementacion.ConnexionRESTNoArea;
import interfaz.implementacion.ConnexionRESTVentas;

public class ConnexionRESTFabrica implements AbstractFactory {

    @Override
    public IConnexionREST getREST(String area) {
        if (area.equalsIgnoreCase("COMPRAS")){
            return new ConnexionRESTCompras();
        }else if(area.equalsIgnoreCase("VENTAS")){
            return new ConnexionRESTVentas();
        }
        return new ConnexionRESTNoArea();
    }

    @Override
    public IConnexionBD getBD(String motor) {
        return null;
    }
}
