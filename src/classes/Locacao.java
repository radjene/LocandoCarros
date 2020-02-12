package classes;

import java.util.Date;

public class Locacao {
    private String codigo;
    private Date dataLocacao;
    private Date dataEntrega;
    private int qtdeDiasLocado;
    private double valorTotalLocacao;
    private String carro;
    private String cliente;
    
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

    /**
     * @return the dataEntrega
     */
    public Date getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the qtdeDiasLocado
     */
    public int getQtdeDiasLocado() {
        return qtdeDiasLocado;
    }

    /**
     * @param qtdeDiasLocado the qtdeDiasLocado to set
     */
    public void setQtdeDiasLocado(int qtdeDiasLocado) {
        this.qtdeDiasLocado = qtdeDiasLocado;
    }

    /**
     * @return the carro
     */
    public String getCarro() {
        return carro;
    }

    /**
     * @param carro the carro to set
     */
    public void setCarro(String carro) {
        this.carro = carro;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    
}
