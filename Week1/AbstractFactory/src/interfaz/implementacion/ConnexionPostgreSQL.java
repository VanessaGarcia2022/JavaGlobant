package interfaz.implementacion;

import interfaz.IConnexionBD;

public class ConnexionPostgreSQL implements IConnexionBD {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    public ConnexionPostgreSQL(){
        // inicializar los atribuos necesarios para la conexion
        // tambien se puede conectar con un archivo properties
        this.host = "localhost";
        this.puerto = "1521";
        this.usuario = "postgres";
        this.contrasena = "123";
    }
    @Override
    public void conectar() {
        //Aqui puede codigo JDBC
        System.out.println("Se conecto a PostgreSQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconecto de PostgreSQL");
    }
}
