package model;

public class PessoaFisica extends Pessoa
{
    private int rg;
    private String cpf;
    private double salarioMensal;
    private int dependentes;
    
    public PessoaFisica(String nome, String endereco, int rg, String cpf, double salarioMensal, int dependentes){
        super(nome, endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
        this.dependentes = dependentes;
    }
    
    //gets e sets
    
    public boolean setRg(int rg){
        if(rg >= 8 && rg <= 11){
            this.rg = rg;
            return true;
        } else {
            return false;
        }
    }
    
    public int getRg(){
        return this.rg;
    }
    
    public boolean setCpf(String cpf){
        if(cpf.length() == 11 || cpf.length() == 14){
            this.cpf = cpf;
            return true;
        } else {
            return false;
        }
    }
    
    public String getCpf (){
        return this.cpf;
    }
    
    public boolean setSalarioMensal(double salarioMensal){
        if(salarioMensal > 0){
            this.salarioMensal = salarioMensal;
            return true;
        } else {
            return false;
        }
    }
    
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    
    public boolean setDependentes(int dependentes){
        if(dependentes > 0){
            this.dependentes = dependentes;
            return true;
        } else {
            return false;
        }
    }
    
    public int getDependentes(){
        return this.dependentes;
    }
    
    //objetivos especificos
    
    public double calcularImposto(){
        if(salarioMensal > 1000){
            double resultado = (salarioMensal * 0.07) - (dependentes * 50.0);
            if(resultado <= 0)
                return 0;
            else
                return resultado;
        } else {
            if(salarioMensal > 500){
                double resultado = (salarioMensal * 0.05) - (dependentes * 50.0);
                if(resultado <= 0)
                    return 0;
                else
                    return resultado;
            } else
                return 0;
        }
    }
    
    @Override
    public String toString(){
        String texto = super.toString();
        texto += ", RG: " + this.rg;
        texto += ", CPF: " + this.cpf;
        texto += ", Salario Mensal: " + this.salarioMensal;
        texto += ", Número de dependentes: " + this.dependentes;
        
        return texto;
    }
}