package com.vanessadev.interfaces;

public interface Language {
    // no es encesario agregar el modificador de acceso en un metodo de una interfaz
    // por que por defecto es public

    void sayHi(); // metodo abstacto no tiene cuerpo

    /*
    los metodos por default:
     - Ya tiene un comportamiento establecido
     - No es necesario sobreescribirlos en las clases en las que se implementa la interfaz
     - No pueden ser abstractos
     */
    default void sayBye(){
        System.out.println("Bye from Interface");
    }

}
