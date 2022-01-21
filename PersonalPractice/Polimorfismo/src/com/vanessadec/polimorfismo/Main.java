package com.vanessadec.polimorfismo;

public class Main {
    public static void main(String[] args) {
        // sin polimorfismo
        /*
        Animal animal = new Animal();
        Perro perro = new Perro();

        animal.comer();
        perro.comer();
        */

        // con polimorfismo
        // Un objeto de una superclase, puede almacenar una instancia de cualquiera de sus subclases
        /*
        Animal animalPolimorfismo = new Perro();
        animalPolimorfismo.comer();
        animalPolimorfismo.dormir();
        animalPolimorfismo.atacar();
        */

        // Magia del polimorfismo
        // arreglo de 4 objetos tipo animals
        Animal [] animals = new Animal[4];

        // asignacion de diferentes clases que heredan de animals
        animals[0] = new Animal();
        animals[1] = new Perro();
        animals[2] = new Gato();
        animals[3] = new Perro();

         // ejecutar los metodos de cada objeto.
        for (Animal a: animals) { // por cada objeto "a" tipo Animal en el arreglo animals hacer.
            a.comer();
        }

    }
}
