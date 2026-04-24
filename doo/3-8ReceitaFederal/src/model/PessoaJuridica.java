package model;

public class PessoaJuridica extends Pessoa
{
    private String cnpj;
    private double faturamento;
    private int enquadramento;
    
    public PessoaJuridica(String nome, String endereco, String cnpj, double faturamento, int enquadramento){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.enquadramento = enquadramento;
    }
    
    //gets e sets
    
    public boolean setCnpj(String cnpj){
        if(cnpj.length() == 14 || cnpj.length() == 18){
            this.cnpj = cnpj;
            return true;
        } else {
            return false;
        }
    }
    
    public String getCnpj (){
        return this.cnpj;
    }
    
    public boolean setFaturamento(double faturamento){
        if(faturamento > 0){
            this.faturamento = faturamento;
            return true;
        } else {
            return false;
        }
    }
    
    public double getFaturamento(){
        return this.faturamento;
    }
    
    public boolean setEnquadramento(int enquadramento){
        switch(enquadramento){
            case 1, 2, 3:
                this.enquadramento = enquadramento;
                return true;
            default:
                return false;
        }
    }
    
    public int getEnquadramento(){
        return this.enquadramento;
    }
    
    //objetivos especificos
    
    public double calcularImposto(){
        switch(enquadramento){
            case 1:
                return faturamento*0.02;
            case 2:
                return faturamento*0.05;
            case 3:
                return faturamento*0.15;
            default:
                return 0;
        }
    }
    
    @Override
    public String toString(){
        String texto = super.toString();
        texto += ", CNPJ: " + this.cnpj;
        texto += ", Faturamento: " + this.faturamento;
        texto += ", Enquadramento: " + this.enquadramento;
        
        return texto;
    }
}