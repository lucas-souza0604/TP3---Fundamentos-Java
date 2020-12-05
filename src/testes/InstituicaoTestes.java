package testes;

import dominio.Instituicao;
import Exception.NomeIncompleto;

public class InstituicaoTestes {
	
	public static void main(String[] args) {
		
		try {
			Instituicao inst1 = new Instituicao();
			inst1.setNome("Instituto Infnet Estudo Brasileiro");
			System.out.println(inst1.getNome());
			
			Instituicao emp2 = new Instituicao();
			emp2.setNome("Instituto Infnet Brasileiro");
			System.out.println(emp2.getNome());
			
			Instituicao emp4 = new Instituicao();
			System.out.println(emp4.getNome());
			
			Instituicao emp3 = new Instituicao();
			emp3.setNome("Instituto");
			System.out.println(emp3.getNome());
			
		} catch (NomeIncompleto e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
