import java.util.ArrayList;

public class Empresa
{
    private String cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa(String cnpj, String razaoSocial){
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public void imprimeFuncionarios(){
        for(Funcionario fun : this.funcionarios){
            fun.toString();
        }
    }
    
    public double getDespesasFolhasPagamento(){
        double totalPagamento = 0;
        for(Funcionario fun : this.funcionarios){
            totalPagamento += fun.getSalarioMensal();
        }
        return totalPagamento;
    }
    
    public void addFuncionario(Funcionario fun){
        this.funcionarios.add(fun);
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return this.funcionarios;
    }
}