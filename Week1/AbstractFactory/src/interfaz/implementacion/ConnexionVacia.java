package interfaz.implementacion;

import interfaz.IConnexionBD;

public class ConnexionVacia implements IConnexionBD {
    @Override
    public void conectar() {
        System.out.println("NO se especifico proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("NO se especifico proveedor");
    }
}
