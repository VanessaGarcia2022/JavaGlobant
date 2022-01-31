package interfaz;

// cloneable es una clase que proporciona Java que permite clonar objetos.
public interface ICuenta extends Cloneable {

    ICuenta clonar();
    // si devuelve la interfaz, debe haber una clase que implemente esta interfaz y que cumpla con este objetivo.
}
