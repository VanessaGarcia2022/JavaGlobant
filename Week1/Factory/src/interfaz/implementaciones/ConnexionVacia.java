package interfaz.implementaciones;

import interfaz.IConexion;

public class ConnexionVacia implements IConexion {
    @Override
    public void conectar() {
        System.out.println("NO se especifico proveedor");
    }

    @Override
    public void desconetar() {
        System.out.println("NO se especifico proveedor");
    }
}
