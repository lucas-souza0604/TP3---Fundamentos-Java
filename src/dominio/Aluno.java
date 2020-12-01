package dominio;

import auxiliar.Constante;
import negocio.Pessoa;

public class Aluno extends Pessoa{
	private float av_1;
	private float av_2;
	
	public Aluno(){
		super();
	}
	
	public Aluno(String nome, int idade, float av_1, float av_2) {
		super(nome, idade);
		this.av_1 = av_1;
		this.av_2 = av_2;
		
	}
	
	public Aluno(String nome, int idade) {
		super(nome, idade);
	}
	
	float calculaMedia(float av_1, float av_2) {
		float media = (av_1 + av_2)/2;
		return media;
	}
	
	
	String situacaoAlunoNotas(float calculoMedia) {
		if (calculoMedia >= Constante.NOTA_APROVACAO) {
			return "Aprovado";
		}else if(calculoMedia < Constante.NOTA_REPROVACAO){
			return "Reprovado";
		}else {
			return "Prova Final";
		}
	}
	
	public String toString() {
		float calculoMedia = calculaMedia(av_1, av_2);
		String situacaoAluno = situacaoAlunoNotas(calculoMedia);
		String perfil = "Discente";
		return String.format("<< %s >> %s - AV1: %.2f - AV2: %.2f - Media: %.2f - Situacao: %s",
				perfil,
				super.toString(),
				this.av_1,
				this.av_2,
				calculoMedia,
				situacaoAluno);
	}

	public float getAv_1() {
		return av_1;
	}

	public void setAv_1(float av_1) {
		this.av_1 = av_1;
	}

	public float getAv_2() {
		return av_2;
	}

	public void setAv_2(float av_2) {
		this.av_2 = av_2;
	}

	@Override
	public float calcularSalarioLiquido() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
