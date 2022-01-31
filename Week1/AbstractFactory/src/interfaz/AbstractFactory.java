package interfaz;

public interface AbstractFactory {
    // Aqui se elige el tipo de familia que se necesita (BD o REST)
    IConnexionBD getBD(String motor);
    IConnexionREST getREST(String area);
}
