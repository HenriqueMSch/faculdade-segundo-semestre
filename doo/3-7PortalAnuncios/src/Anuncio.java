public class Anuncio
{
    private String produto;
    private double valorVenda;
    private String cidade;
    private String estado;
    
    public Anuncio(String produto, double valorVenda, String cidade, String estado){
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public boolean setProduto(String produto){
        if(produto.length() > 0){
            this.produto = produto;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setValorVenda(double valorVenda){
        if(valorVenda > 0){
            this.valorVenda = valorVenda;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setCidade(String cidade){
        if(cidade.length() >= 3 && cidade.length() <= 32){
            this.cidade = cidade;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setEstado(String estado){
        if(estado.length() == 2){
            this.estado = estado;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        String texto = "Produto: " + this.produto;
        texto += ", Valor de Venda: " + this.valorVenda;
        texto += ", cidade: " + this.cidade;
        texto += ", Estado: " + this.estado;
        
        return texto;
    }
}