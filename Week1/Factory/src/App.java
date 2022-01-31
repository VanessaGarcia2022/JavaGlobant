import interfaz.IConnexion;

public class App {
    public static void main(String[] args) {
        ConnexionFabrica fabrica = new ConnexionFabrica();

        IConnexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconectar();

        IConnexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconectar();

        IConnexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconectar();
    }
}
