package meuapp;

public class ExemploArrayList {
	public static void main(String[]args){
	ArrayList<pessoa> agendaPessoas = new ArrayList<pessoa>();
		do {
			System.out.println("1-Cadastrar pessoa na agenda");
			System.out.println("2-Listar pessoas da agenda");
			System.out.println("0-Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = scn.nextInt();
			if(opcao == 1){
				cadastrar();
			}else if(opcao == 2){
				listar();
			}else if(opcao == 0){
				System.out.println("encerrando...");
			}else{
				System.out.println("Opção inválida");
			}
	}
}