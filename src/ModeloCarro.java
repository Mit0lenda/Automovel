package br.com.alura.carro;

public class  ModeloCarro extends Carro {
    public class TesteCarro() {
        public static void main (String [] args) {
            ModeloCarro meuCarro = new ModeloCarro();
            meuCarro.definirModelo("Sedan");
            meuCarro.definirPrecoano(3000,4000,5000);
            meuCarro.exibirInfo();
        }
    }
}
