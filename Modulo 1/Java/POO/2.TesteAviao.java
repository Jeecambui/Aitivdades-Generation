package Generation;

public class TesteAviao{
	public static void main(String[] args) {
		
		Aviao[] passageiros = new Aviao[3];

		passageiros[0] = new Aviao(1,"Jeferson Silva", 1,"S�o Paulo","Dublin");
		passageiros[1] = new Aviao(2,"Maria Souza", 2,"Recife","New York");
		passageiros[2] = new Aviao(3,"Jo�o Nascimento", 3,"Maranh�o","Rio de Janeiro");

		for (Aviao leia: passageiros) {
			leia.ImprimirInfo();
		}
	}

}

