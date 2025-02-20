package com.mycompany.funcionarios;

class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println(nome + " esta trabalhando.");
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}

class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void realizarReuniao() {
        System.out.println(getNome() + " esta realizando uma reuniao no departamento " + departamento + ".");
    }
}

public class Funcionarios {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Carlos", 3000.0);
        Gerente gerente = new Gerente("Ana", 5000.0, "TI");

        func.trabalhar();
        gerente.trabalhar();
        gerente.realizarReuniao();
    }
}
