public class Main {
    public static void main(String[] args) {
        EnglishLanguage english = new EnglishLanguage();
        ProgramingLanguage plJava = new ProgramingLanguage();

        english.sayHi();
        english.sayBye();
        english.traducir();
        plJava.sayHi();
        plJava.sayBye();
    }
}
