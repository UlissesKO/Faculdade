package classeAbstrata;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Classe pai é abstrata, portanto não dá para instacia-la
		Lider func1 = new Lider(19, "Ulisses", "Segurança", 1000);
		
		System.out.println(consultarDados(func1));
	}
	public static String consultarDados(Lider _func) {
		return "Dados Lider\n\nNome: "+_func.getNome()+"\nIdade: "+_func.getIdade()+"\nSetor: "+_func.getSetor()+"\nSalario mensal: "+_func.calcSalario()+"\n----";
	}

}
