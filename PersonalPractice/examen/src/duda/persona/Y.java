package duda.persona;

public class Y extends X {
    private String colegio;

    public Y(){
    }
    public Y(String name, String colegio) {
        super(name);
        this.colegio = colegio;
    }

    public void doY() {
        System.out.println("estoy en do Y");
    }
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
}
