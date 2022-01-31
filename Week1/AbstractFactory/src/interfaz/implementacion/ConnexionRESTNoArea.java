package interfaz.implementacion;

import interfaz.IConnexionREST;

public class ConnexionRESTNoArea implements IConnexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("No Area");
    }
}
