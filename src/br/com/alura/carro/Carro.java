package br.com.alura.carro;

public class Carro {
    private String modelo;
    private double precoano1;
    private double precoano2;
    private double precoano3;


    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecoano(double precoano1, double precoano2, double precoano3) {
        this.precoano1 = precoano1;
        this.precoano2 = precoano2;
        this.precoano3 = precoano3;
    }

    public void exibirInfo() {
        System.out.println("Modelo:" + modelo);
        System.out.println("Preço do Ano 1: " + precoano1);
        System.out.println("Preço do Ano 2: " + precoano2);
        System.out.println("Preço do Ano 3: " + precoano3);
        System.out.println("Menor Preço: " + calcularMenorPreco());
        System.out.println("Maior Preço: " + calcularMaiorPreco());
    }

    public double calcularMenorPreco() {
        double menor = precoano1;
        if (precoano2 < menor) {
            menor = precoano2;
        } else if (precoano3 < menor) {
            menor = precoano3;
        }
        return menor;
    }

    public double calcularMaiorPreco() {
        double maior = precoano1;
        if (precoano2 > maior) {
            maior = precoano2;
        } else if (precoano3 > maior) {
            maior = precoano3;
        }
        return maior;
    }
}
