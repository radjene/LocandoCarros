package classes;

import java.util.Date;

public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private Date ano;
    private double valorDiariaLocacao;

    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the valorDiariaLocacao
     */
    public double getValorDiariaLocacao() {
        return valorDiariaLocacao;
    }

    /**
     * @param valorDiariaLocacao the valorDiariaLocacao to set
     */
    public void setValorDiariaLocacao(double valorDiariaLocacao) {
        this.valorDiariaLocacao = valorDiariaLocacao;
    }

    /**
     * @return the ano
     */
    public Date getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Date ano) {
        this.ano = ano;
    }
    
    
    
}
