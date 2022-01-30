package model;

public class Conexion {
    // declaracion
    private static Conexion instancia;
    // private static Conexion instancia = new Conexion()

    // para evitar instancia mediante el operador new
    private Conexion() {
        // constructor es privado para que no se pueda instanciar desde ninguna otra parte
        // y sea obligatorio obtener la instancia desde el metodo "getInstance()"

    }

    //Para obtener la instancia unicamente por este metodo
    // La palabra reservada static haceposible el acceso mediante Clase.metodo
    public static Conexion getInstance() {
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }

    // metodo prueba
    public void conectar() {
        System.out.println("Meconecte a la BD");
    }

    // metodo prueba
    public void desconectar() {

        System.out.println("Desconexion exitosa.");
    }
}
