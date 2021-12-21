package map.application;

import java.util.Objects;

public class Product {
    private String nome;
    private double valor;

    public Product(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.valor, valor) == 0 && Objects.equals(nome, product.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, valor);
    }
}
