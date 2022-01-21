package com.vanessadev.encapsulation;

public class Book {
    // los atributos de una clase deben ser siempre privados
    private String title;
    private String author;
    private boolean available;

    // getter y setter: sirven para acceder a atributos privados desde otra clase
    /*
        - Debe ser público para que se pueda acceder desde otras clases
        - debe tener un tipo de retorno del mismo tipo que el atributo que va a retornar
        - debe iniciar con la palabra "get"
     */

    public String getTitle() {
        return title;
    }
    /*
        - Debe ser público para que se pueda acceder desde otras clases
        - No retorna nada, por esto es tipo void.
        - debe recibir como parameter una variable del mismo tipo que el atributo que se va a modificar
        - debe iniciar con la palabra "set"
     */

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // para obtener un booleano se cambia la palabra "get" por "is"
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
