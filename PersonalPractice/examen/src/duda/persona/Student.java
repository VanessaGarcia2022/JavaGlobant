package duda.persona;

public class Student extends Person{
    private String colegio;

    public Student(){
    }
    public Student(String name, String colegio) {
        super(name);
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
}
