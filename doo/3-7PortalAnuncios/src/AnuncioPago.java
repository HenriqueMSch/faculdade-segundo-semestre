public class AnuncioPago extends Anuncio
{
    private int quantDias;
    private double valorPago;
    
    public AnuncioPago(String produto, double valorVenda, String cidade, String estado, int quantDias, double valorPago){
        super(produto, valorVenda, cidade, estado);
        this.quantDias = quantDias;
        this.valorPago = valorPago;
    }
    
    public boolean setQuantDias(int quantDias){
        if(quantDias > 0){
            this.quantDias = quantDias;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setValorPago(double valorPago){
        if(valorPago > 0){
            this.valorPago = valorPago;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        String texto = "Quantidade de dias: " + this.quantDias;
        texto += ", Valor Pago: " + this.valorPago;
        
        return texto;
    }
}