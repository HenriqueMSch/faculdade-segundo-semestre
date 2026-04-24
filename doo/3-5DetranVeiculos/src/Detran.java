import java.util.ArrayList;

public class Detran
{
    private String estado;
    private ArrayList<Veiculo> veiculos;
    
    public Detran (){
        this.estado = estado;
        veiculos = new ArrayList<Veiculo>();
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public boolean setEstado(String estado){
        if(!estado.equals("")){
            this.estado = estado;
            return true;
        } else {
            return false;
        }
    }
    
    public void addVeiculo(Veiculo vec){
        this.veiculos.add(vec);
    }
    
    public ArrayList<Veiculo> getVeiculos(){
        return this.veiculos;
    }
    
    public String toString(){
        String texto ="Estado: " + this.estado + "\n"; 
        for(Veiculo vec : this.veiculos){
             texto += vec.toString();   
        }
        
        return texto;
    }
}