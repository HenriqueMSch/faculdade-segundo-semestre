import java.util.ArrayList;

public class Clube
{
    private String nome;
    private String cidade;
    private ArrayList<Socio> socios;
    
    public Clube(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        socios = new ArrayList<Socio>();
    }
    
    public void addSocio(Socio soc){
        this.socios.add(soc);
    }
    
    public ArrayList<Socio> getSocios(){
        return this.socios;
    }
    
    public ArrayList<Socio> getSociosMenoresDeIdade(){
        ArrayList<Socio> aux = new ArrayList<Socio>();
        for(Socio soc : this.socios){
            if(soc.getIdade() < 18){
                aux.add(soc);
            }
        }
        return aux;
    }
    
    public double getIdadeMediaSocios(){
        int somaIdade = 0;
        for(Socio soc : this.socios){
            somaIdade += soc.getIdade();
        }
        return (double)somaIdade / this.socios.size();
    }
    
    public ArrayList<Socio> getSociosIdadeMaiorQueMedia(){
        ArrayList<Socio> aux = new ArrayList<Socio>();
        double media = getIdadeMediaSocios();
        for(Socio soc : this.socios){
            if(soc.getIdade() > media){
                aux.add(soc);
            }
        }
        return aux;
    }
    
    public double getArrecadacaoMensalidades(){
        double somaMensalidade = 0;
        for(Socio soc : this.socios){
            somaMensalidade += soc.getValorMensalidade();
        }
        return somaMensalidade;
    }
    
    public boolean removerSocio(int matricula){
        for(Socio soc : this.socios){
            if(matricula == soc.getMatricula()){
                this.socios.remove(soc);
                return true;
            }
        }
        return false;
    }
    
    public String toString(){
        String texto = "Nome: " + this.nome + ", Cidade: " + this.cidade;
        texto += "\nSocios:\n";
        for(Socio soc : this.socios){
            texto += soc.toString() + "\n";
        }
        return texto;
    }
}