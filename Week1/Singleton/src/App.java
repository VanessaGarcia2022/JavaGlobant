import model.Conexion;

public class App {
    public static void main(String[] args) {
        //instanciacion por constructor prohibido por ser "private"
        // Conexion c = new Conexion();
        Conexion c = Conexion.getInstance();
        c.conectar();
        c.desconectar();

        boolean rpta = c instanceof Conexion;
        System.out.println(rpta);
    }

}
