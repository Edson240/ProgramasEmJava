package org.zoo;

public class Animal {f
    private String nome;
    private String nomeSom;

    public Animal (String nome, String nomeSom) {
        this.nome = nome;
        this.nomeSom = nomeSom;
    }
    public String getNome(){
        return this.nome;
    }
    public String getNomeSom(){
        return this.nomeSom;
    }
    public void emitirSom(){
        System.out.println(" O animal: " + this.nome + " emite um som " + this.nomeSom);
    }

}
