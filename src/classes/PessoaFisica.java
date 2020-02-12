package classes;

import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String cnh;
    private Date dtNascimento;
    
    

    @Override
    public String getCpfOuCnpj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCnhOuCnhr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the dtNascimento
     */
    @Override
    public Date getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    @Override
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Override
    public String CpfOuCnpj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String CnhOuCnhr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
