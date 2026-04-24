package modelo;

public class Produto {

    private int codigo;
    private String descricao;
    private double valor;
    private Categoria categoria;

    public Produto(int codigo, String descricao, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public String toString(){
        return this.codigo+" - "+this.descricao+" - ("+this.categoria+") - "+this.valor;
    }
}
