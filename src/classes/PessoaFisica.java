package classes;

import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String cnh;
    private Date dtNascimento;

    public PessoaFisica(){
        super();
    }
    
    
    
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    
    public void setdtNascimento(Date dtNascimento){
        this.dtNascimento = dtNascimento;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCnh(String cnh){
        this.cnh = cnh;
    }
    
    @Override
    public Date getDtNascimento(){
        return this.dtNascimento;
    }
    
    @Override
    public String getCnhOuCnhr(){
        return this.cnh;
    }
    
    @Override
    public String getCpfOuCnpj() {
        return this.cpf;
    }

    // só deus sabe o que acontece por essas terras
    @Override
    public double getDesconto() {
       return 0;
    }
    
    
}
