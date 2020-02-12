package classes;

import java.util.Date;

public abstract class Cliente {
    private String nome;
    private String endereco;
    private Date dtNascimento;
    private double desconto;
    public abstract String CpfOuCnpj();
    public abstract String CnhOuCnhr();

    /**
     * @return the nome
     */
    
    
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the dtNascimento
     */
    public Date getDtNascimento() {
        return dtNascimento;
    }

    /**
     * @param dtNascimento the dtNascimento to set
     */
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    /**
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getCpfOuCnpj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getCnhOuCnhr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
