package classes;

import java.util.Date;

public class Locacao {
    private String codigo;
    private Date dataLocacao;
    private Date qtdeDiasLocado;
    private double valorTotalLocacao;
    //chamar carro e cliente

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the dataLocacao
     */
    public Date getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the qtdeDiasLocado
     */
    public Date getQtdeDiasLocado() {
        return qtdeDiasLocado;
    }

    /**
     * @param qtdeDiasLocado the qtdeDiasLocado to set
     */
    public void setQtdeDiasLocado(Date qtdeDiasLocado) {
        this.qtdeDiasLocado = qtdeDiasLocado;
    }

    /**
     * @return the valorTotalLocacao
     */
    public double getValorTotalLocacao() {
        return valorTotalLocacao;
    }

    /**
     * @param valorTotalLocacao the valorTotalLocacao to set
     */
    public void setValorTotalLocacao(double valorTotalLocacao) {
        this.valorTotalLocacao = valorTotalLocacao;
    }
    
    
    
}
