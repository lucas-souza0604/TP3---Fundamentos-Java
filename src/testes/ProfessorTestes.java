package testes;

import dominio.Professor;

public class ProfessorTestes {
	public static void main(String[] args) {
		Professor professor1 = new Professor();
		professor1.setNome("Lucas");
		professor1.setIdade(21);
		professor1.setSalario(1000);
		professor1.setBonus(300);
		professor1.setDesconto(150);
		
		System.out.println(professor1);
		
		Professor professor2 = new Professor("Elaine", 45);
		professor2.setSalario(2000);
		professor2.setBonus(300);
		professor2.setDesconto(150);
		System.out.println(professor2);
		
		Professor professor3 = new Professor("Anderson", 46, 3000, 300, 150);
		System.out.println(professor3);
	}
}
