package interfaz.implementacion;

import interfaz.IConnexionREST;

public class ConnexionRESTVentas implements IConnexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose en ventas a" + url);
    }
}
