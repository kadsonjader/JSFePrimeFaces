
package br.com.atividade3.modelo;

public class Livro {
  private String titulo;
  private String ISBN;
  private double preco;
  private String dtlancamento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDtlancamento() {
        return dtlancamento;
    }

    public void setDtlancamento(String dtlancamento) {
        this.dtlancamento = dtlancamento;
    }

   
}
