public class EnglishLanguage implements Language{// se pueden implementar varias interfaces

    /*
    se obliga a sobre escribir los metodos de la interfaz,o sino genera error
     */
    @Override // para sobreescribir el metodo de la interfaz
    public void sayHi() {
        System.out.println("Hi from English Language");

    }

    @Override
    public void traducir() {
        System.out.println("ya estoy en ingles");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye from english");
    }
}
