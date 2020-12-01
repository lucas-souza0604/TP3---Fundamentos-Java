package dominio;

import negocio.Pessoa;

public class Professor extends Pessoa{
	private float salario;
	private float bonus;
	private float desconto;
	
	public Professor(){
		super();
	}
	
	public Professor(String nome, int idade, float salario, float bonus, float desconto) {
		super(nome, idade);
		this.salario = salario;
		this.bonus = bonus;
		this.desconto = desconto;
	}
	
	public Professor(String nome, int idade) {
		super(nome, idade);
	}
	
	public float calcularSalarioLiquido() {	
		return this.getSalario() + this.bonus - this.desconto;
	}
	
	public String toString() {
		String perfil = "Docente";
		float salarioLiquido = calcularSalarioLiquido();
		return String.format("<< %s >> %s - Salario: R$%.2f - Bonus: R$%.2f - Desconto: R$%.2f - Salario Liquido: R$%.2f",
				perfil,
				super.toString(),
				this.salario,
				this.bonus,
				this.desconto,
				salarioLiquido);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	
}
