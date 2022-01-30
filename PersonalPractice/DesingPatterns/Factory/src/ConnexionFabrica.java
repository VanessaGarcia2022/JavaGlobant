import interfaz.IConexion;
import interfaz.implementaciones.*;

public class ConnexionFabrica {
    public IConexion getConexion(String motor){

        if(motor.equalsIgnoreCase("MYSQL")){
            return new ConnexionMySQL();
        }else if(motor.equalsIgnoreCase("ORACLE"))
        {
            return new ConnexionOracle();
        }else if(motor.equalsIgnoreCase("POSTGRE"))
        {
            return new ConnexionPostgreSQL();
        }else if(motor.equalsIgnoreCase("SQL"))
        {
            return new ConnexionSQLServer();
        }
        return new ConnexionVacia();
    }
}
