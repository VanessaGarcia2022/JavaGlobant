package duda.persona;

public class X {
    private String name;

    public X(){
    }

    X(String name){
        this.name = name;
    }

    public void doX() {
        System.out.println("estoy en do X");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
