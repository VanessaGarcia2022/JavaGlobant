import interfaz.IConexion;

public class App {
    public static void main(String[] args) {
        ConnexionFabrica fabrica = new ConnexionFabrica();

        IConexion cx1 = fabrica.getConexion("ORACLE");
        cx1.conectar();
        cx1.desconetar();

        IConexion cx2 = fabrica.getConexion("MYSQL");
        cx2.conectar();
        cx2.desconetar();

        IConexion cx3 = fabrica.getConexion("H2");
        cx3.conectar();
        cx3.desconetar();
    }
}
