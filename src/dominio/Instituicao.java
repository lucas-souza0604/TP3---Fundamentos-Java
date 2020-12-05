package dominio;

import Exception.NomeIncompleto;

public class Instituicao {
	
	private String nome;
	private String nomeDoMeio;
	private String nomeFinal;

	public void exibir() {
		System.out.println("Empresa: " + this.toString());
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s",
				this.nome,
				this.nomeDoMeio,
				this.nomeFinal);
	}
	
	public String getNome() throws NomeIncompleto {
		
		if (this.nome == null || this.nomeDoMeio == null || this.nomeFinal == null) {
			throw new NomeIncompleto("EXP: Necessario informar o nome da instituicao com pelo menos 2 nomes");
		}
		
		
		StringBuilder sb = new StringBuilder();
		if (this.nome != null && this.nomeDoMeio != null && this.nomeFinal != null) {
			sb.append(this.nomeFinal.toUpperCase().charAt(0));
			sb.append(". ");
			sb.append(this.nome.toUpperCase());
			sb.append(" ");
			sb.append(this.nomeDoMeio.toLowerCase());
		}else {
			System.out.println("Necessario informar o nome da instituicao com pelo menos 2 nomes");
		}
		return sb.toString();
		
	}
	public void setNome(String nome) throws NomeIncompleto{
		
		if (nome.split(" ").length <= 1) {
			throw new NomeIncompleto("Preencha o nome correto");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.lastIndexOf(" ");
			
			
		this.nome = nome.substring(0, posInicial).trim();
		this.nomeDoMeio = nome.substring(posInicial, posFinal).trim();
		this.nomeFinal = nome.substring(posFinal).trim();

	}	

}

