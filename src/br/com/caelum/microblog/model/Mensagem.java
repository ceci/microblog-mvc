package br.com.caelum.microblog.model;

public class Mensagem {

	private String descricao;

	public Mensagem() {
	}

	public Mensagem(String descricao) {
		this.descricao = descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
