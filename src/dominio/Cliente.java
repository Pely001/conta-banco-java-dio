package dominio;

import java.time.LocalDate;

public class Cliente {

	private String nome;
    private String cpf;
    private String nascimento;
    private LocalDate dataCadastro;

	public Cliente(LocalDate dataCriacao) {
        this.dataCadastro = dataCriacao;
    }

    public LocalDate getDataCriacao() {
        return dataCadastro;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCadastro = dataCriacao;
    }

    public Cliente(String nome, String cpf, String nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}