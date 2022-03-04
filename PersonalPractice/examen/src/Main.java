import duda.persona.Person;
import duda.persona.Student;

import java.security.Permission;

public class Main {
    public static void main(String[] args) {
        Person person = new Student();
        person.setName("Globant");
        System.out.println(person.getName());

        //Student student = new Person();

    }
}
