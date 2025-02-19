package com.mycompany.teste;

class Veiculo {
    String marca;
    String modelo;

    void acelerar() {
        System.out.println("O veículo está acelerando.");
    }

    void frear() {
        System.out.println("O veículo está freando.");
    }
}

class Carro extends Veiculo {
    int numeroPortas;
}

public class Teste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.numeroPortas = 4;

        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Número de portas: " + carro.numeroPortas);

        carro.acelerar();
        carro.frear();
    }
}