package interfaz.implementaciones;

import interfaz.IConexion;

public class ConnexionMySQL implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasena;

    //constructor
    public ConnexionMySQL(){
        // inicializar los atribuos necesarios para la conexion
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasena = "123";
    }

    @Override
    public void conectar() {
        //Aqui puede codigo JDBC
        System.out.println("Se conecto a MySQL");
    }

    @Override
    public void desconetar() {
        System.out.println("Se desconecto de MySql");
    }
}

