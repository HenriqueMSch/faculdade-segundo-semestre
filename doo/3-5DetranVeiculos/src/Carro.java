public class Carro extends Veiculo
{
    private int portas;
    
    public Carro(String modelo, int ano, String placa, double valor, int portas){
        super(modelo, ano, placa, valor);
        this.portas = portas;
    }
    
    public int getPortas(){
        return this.portas;
    }
    
    public boolean setPortas(int portas){
        if(portas > 0){
            this.portas = portas;
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString(){
        String texto = "Carro Modelo: " + this.modelo;
        texto += ", Ano: " + this.ano;
        texto += ", Placa: " + this.placa;
        texto += ", Valor: " + this.valor;
        texto += ", Portas: " + this.portas + "\n";
        
        return texto;
    }
}