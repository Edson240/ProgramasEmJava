package org.zoo;

public class main {

    public static void main (String[] args) {
        Animal animalCachorro = new Cachorro( "Rex",  " Au au");
        Animal animalGato = new Gato ( " Tomas ", " miau miau");

        animalCachorro.emitirSom();
        animalGato.emitirSom();

        Veterinario veterinario = new Veterinario();
        veterinario.examinarAnimal(animalCachorro);
        veterinario.examinarAnimal(animalGato);
    }
}
