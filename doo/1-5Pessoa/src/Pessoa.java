public class Pessoa{
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    
    public Pessoa (int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public boolean setNome (String nome){
        if(true){
            this.nome = nome;
            return true;
        } else{
            return false;
        }
    }
    
    public double getPeso (){
        return this.peso;
    }
    
    public boolean setPeso (double peso){
        if(peso > 0){
            this.peso = peso;
            return true;
        } else{
            return false;
        }
    }
    
    public double getAltura (){
        return this.altura;
    }
    
    public boolean setAltura (double altura){
        if(altura > 0){
            this.altura = altura;
            return true;
        } else{
            return false;
        }
    }
}