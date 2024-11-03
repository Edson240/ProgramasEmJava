package org.zoo;

public class Cachorro extends Animal{

    public Cachorro (String nome, String nomeSom){
        super(nome,nomeSom);
    }

    @Override
    public void emitirSom(){
        System.out.println(" O Cachorro : " + getNome() + " emite um som " + getNomeSom());
    }
}
