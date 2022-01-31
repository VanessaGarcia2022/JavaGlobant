import interfaz.AbstractFactory;

public class FabricaProductor {
    public static AbstractFactory getFactory(String typeFactory){
        if (typeFactory.equalsIgnoreCase("BD")){
            return new ConnexionBDFabrica();
        }else if (typeFactory.equalsIgnoreCase("REST")){
            return new ConnexionRESTFabrica();
        }
        return null;
    }
}
