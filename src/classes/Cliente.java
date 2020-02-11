package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Cliente {
    private String nome;
    private String endereco;
    public abstract Date getDtNascimento();
    public abstract double getDesconto();
    public abstract String getCpfOuCnpj();
    public abstract String getCnhOuCnhr();

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

}
