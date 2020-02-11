package classes;

import java.util.Date;

/**
 *
 * @author matera
 */
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String cnhResponsavel;
    private double desconto;

    public PessoaJuridica(){
        super();
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

    public void setCnhResponsavel(String cnhResponsavel) {
        this.cnhResponsavel = cnhResponsavel;
    }
    
    
    
    public void setDesconto(double desconto){
        this.desconto = desconto;
    }
    
    @Override
    public double getDesconto(){
        return this.desconto;
    }
    
    @Override
    public String getCnhOuCnhr(){
        return this.cnhResponsavel;
    }

    @Override
    public String getCpfOuCnpj() {
        return this.cnpj;
    }

    // só deus sabe o que acontece por essas terras
    @Override
    public Date getDtNascimento() {
         Date date = new Date();
         return date;
    }


}
