package testes;

import dominio.Aluno;

public class AlunoTestes {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Lucas");
		aluno1.setIdade(21);
		aluno1.setAv_1(2);
		aluno1.setAv_2(3);
		System.out.println(aluno1);
		
		Aluno aluno2 = new Aluno("Elaine", 45);
		aluno2.setAv_1(8);
		aluno2.setAv_2(9);
		System.out.println(aluno2);
		
		Aluno aluno3 = new Aluno("Anderson", 46, 4, 5);
		System.out.println(aluno3);
	}
}
