package interfaz.implementaciones;

import interfaz.IConnexion;

public class ConnexionVacia implements IConnexion {
    @Override
    public void conectar() {
        System.out.println("NO se especifico proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("NO se especifico proveedor");
    }
}
