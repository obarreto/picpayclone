package br.com.dio.picpayclone.enuns;

public enum BandeiraCartao {
	VISA("Visa"), MASTERCARD("MASTER CARD"), ELO("ELO");
	
	private String descricao;
	
	BandeiraCartao(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
