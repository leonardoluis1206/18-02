package com.mycompany.animais;

class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println(nome + " esta emitindo um som.");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

class Mamifero extends Animal {
    private String tipoPelagem;

    public Mamifero(String nome, int idade, String tipoPelagem) {
        super(nome, idade);
        this.tipoPelagem = tipoPelagem;
    }

    public void amamentar() {
        System.out.println(getNome() + " esta amamentando.");
    }
}

public class Animais {
    public static void main(String[] args) {
        Animal animal = new Animal("Papagaio", 3);
        Mamifero mamifero = new Mamifero("Leoa", 5, "Densa");

        animal.emitirSom();
        mamifero.emitirSom();
        mamifero.amamentar();
    }
}