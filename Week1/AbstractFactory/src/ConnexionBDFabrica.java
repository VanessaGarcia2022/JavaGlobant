import interfaz.AbstractFactory;
import interfaz.IConnexionBD;
import interfaz.IConnexionREST;
import interfaz.implementacion.*;

public class ConnexionBDFabrica implements AbstractFactory {
    @Override
    public IConnexionBD getBD(String motor) {
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

    @Override
    public IConnexionREST getREST(String area) {
        return null;
    }
}
