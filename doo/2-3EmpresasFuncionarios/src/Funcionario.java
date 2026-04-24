public class Funcionario
{
    private int matricula;
    private String nome;
    private double salario;
    
    public Funcionario(int matricula){
        this.matricula = matricula;
    }
    
    public boolean setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean setSalarioMensal(double salario){
        if(salario > 0){
            this.salario = salario;
            return true;
        } else {
            return false;
        }
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getSalarioMensal(){
        return this.salario;
    }
    
    public String toString(){
        return "Matricula: " + this.matricula + ", Nome: " + this.nome + ", Salario: " + this.salario;
    }
}