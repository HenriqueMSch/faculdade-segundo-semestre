public class Moto extends Veiculo
{
    private int cilindradas;
    
    public Moto(String modelo, int ano, String placa, double valor, int cilindradas){
        super(modelo, ano, placa, valor);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return this.cilindradas;
    }
    
    public boolean setCilindradas(int cilindradas){
        if(cilindradas > 0){
            this.cilindradas = cilindradas;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        String texto = "Moto Modelo: " + this.modelo;
        texto += ", Ano: " + this.ano;
        texto += ", Placa: " + this.placa;
        texto += ", Valor: " + this.valor;
        texto += ", Cilindradas: " + this.cilindradas + "\n";
        
        return texto;
    }
}