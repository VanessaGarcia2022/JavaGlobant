public class ProgramingLanguage implements Language{
    @Override
    public void sayHi() {
        System.out.println("Hi from Programing Language JAVA");
    }

    @Override
    public void traducir() {

    }

    @Override
    public void sayBye() {
        Language.super.sayBye();
    }
}
