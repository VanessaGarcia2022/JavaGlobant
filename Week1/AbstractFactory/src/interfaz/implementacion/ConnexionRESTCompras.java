package interfaz.implementacion;

import interfaz.IConnexionREST;

public class ConnexionRESTCompras implements IConnexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose en compras a " + url);
    }
}
