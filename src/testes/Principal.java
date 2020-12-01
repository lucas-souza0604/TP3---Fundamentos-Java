package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;
import dominio.Aluno;
import dominio.Professor;
import negocio.Pessoa;

public class Principal {
	
	private static Pessoa[] pessoas;
		
	private static void imprimir(int id) {
		System.out.println(" " + id +  " " + pessoas[id].toString());
	}

	
	private static void imprimir() {
		for (int i = 0; i < Constante.QTDE; i++) {
			if (pessoas[i] != null) {
				imprimir(i);
				System.out.println("=======================================");
			}
		}
	}
	
	public static void main(String[] args) {
		
		pessoas = new Pessoa[Constante.QTDE];

		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int opcao;
		do {
			
//			Menu
			System.out.println("[1] Cadastrar professor");
			System.out.println("[2] Cadastrar aluno");
			System.out.println("[3] Consultar situação de um docente/discente");
			System.out.println("[4] Sair");
			System.out.print("Informe a opcao requerida: ");
			opcao = in.nextInt();
			
			if(Arrays.asList(Constante.OPCOES).contains(opcao)){
				switch (opcao) {
					case 1: {
						if(i >= 0 && i < Constante.QTDE){
							Professor prof = new Professor();
							System.out.printf("Informe seu nome: ");
							prof.setNome(in.next());
							
							System.out.printf("Informe sua idade: ");
							prof.setIdade(in.nextInt());
							
							System.out.printf("Informe seu salario: ");
							prof.setSalario(in.nextFloat());
							
							System.out.printf("Informe seu bonus: ");
							prof.setBonus(in.nextFloat());
							
							System.out.printf("Informe seu desconto: ");
							prof.setDesconto(in.nextFloat());
							
							pessoas[i] = prof;
							
							System.out.println("Professor incluido...");
							imprimir(i);
							System.out.println("... conforme solicitado ");
							i++;
							
						}else {
							System.out.println("Nao foi possivel cadastrar o Professor!");
						}
						break;
					}
					
					case 2:{
						if(i >= 0 && i < Constante.QTDE){
							Aluno aul = new Aluno();
							System.out.printf("Informe seu nome: ");
							aul.setNome(in.next());
							
							System.out.printf("Informe sua idade: ");
							aul.setIdade(in.nextInt());
							
							System.out.printf("Informe a AV1: ");
							aul.setAv_1(in.nextFloat());
							
							System.out.printf("Informe a AV2: ");
							aul.setAv_2(in.nextFloat());
							
							pessoas[i] = aul;
							
							System.out.println("Aluno incluido...");
							imprimir(i);
							System.out.println("... conforme solicitado ");
							i++;
							
						}else {
							System.out.println("Nao foi possivel cadastrar o Aluno!");
						}
						break;
					}
					case 3: {
						System.out.print("Informe o ID do Docente/Discente requerido: ");
						int id_user = in.nextInt();
						if(id_user >= 0 && id_user < i) {
							imprimir(id_user);
						}else{
							System.out.println("ID de usuario nao existe");
						}
						break;
					}
					case 4: {
						imprimir();
						break;
					}
				}
	
			}else {
				System.out.println("Opcao solicitada nao existe");
			}
		} while(opcao != 4);//i < QTDE
		
		System.out.println("=== Cadastramento realizado com sucesso! ===");
		imprimir();
		System.out.println("============================================");
		in.close();
	}
	
	
}
