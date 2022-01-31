package interfaz.implementacion;

import interfaz.IConnexionBD;

public class ConnexionOracle implements IConnexionBD {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnexionOracle() {
        // inicializar los atribuos necesarios para la conexion
        // tambien se puede conectar con un archivo properties
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "admin";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede codigo JDBC
        System.out.println("Se conecto a Oracle");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de Oracle");
    }
}
