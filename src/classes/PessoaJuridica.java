package classes;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String cnhResponsavel;
    private double descontoLocacao;
    
    

    @Override
    public String getCpfOuCnpj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCnhOuCnhr() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the cnhResponsavel
     */
    public String getCnhResponsavel() {
        return cnhResponsavel;
    }

    /**
     * @param cnhResponsavel the cnhResponsavel to set
     */
    public void setCnhResponsavel(String cnhResponsavel) {
        this.cnhResponsavel = cnhResponsavel;
    }

    /**
     * @return the descontoLocacao
     */
    public double getDescontoLocacao() {
        return descontoLocacao;
    }

    /**
     * @param descontoLocacao the descontoLocacao to set
     */
    public void setDescontoLocacao(double descontoLocacao) {
        this.descontoLocacao = descontoLocacao;
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
