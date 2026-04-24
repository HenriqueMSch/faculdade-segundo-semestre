public class PessoaCasada {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private PessoaCasada conjuge;
    
    public PessoaCasada(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    
    public String getNome (){
        return this.nome;
    }

    public double getPeso (){
        return this.peso;
    }

    public double getAltura (){
        return this.altura;
    }

    public String getNomeConjuge(){
        return this.conjuge.nome;
    }

    public boolean setNome (String nome){
        if(true){
            this.nome = nome;
            return true;
        } else{
            return false;
        }
    }
    
    public boolean setPeso (double peso){
        if(peso > 0){
            this.peso = peso;
            return true;
        } else{
            return false;
        }
    }
    
    public boolean setAltura (double altura){
        if(altura > 0){
            this.altura = altura;
            return true;
        } else{
            return false;
        }
    }
    
    public boolean casar(PessoaCasada outraPessoa){
        if(this.conjuge == null){
            this.conjuge = outraPessoa;
            outraPessoa.conjuge = this;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean ehCasado(){
        if(this.conjuge != null){
            return true;
        } else {
            return false;
        }
    }

}