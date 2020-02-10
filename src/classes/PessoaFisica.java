package classes;

import java.util.Date;

public class PessoaFisica extends Cliente {
    private String cpf;
    private String cnh;
    private Date dtNascimento;

    
    public PessoaFisica(String cpf, String cnh, Date dtNascimento) {
        this.cpf = cpf;
        this.cnh = cnh;
        this.dtNascimento = dtNascimento;
    }

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(String nome, String endereco) {
        super(nome, endereco);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

   
}