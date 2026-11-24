 package abstracao;

 public class A_PrincipalGato {
	    public static void main(String[] args) {
	        A_Gato gato1 = new A_Gato();
	        gato1.nome = "Mingau";
	        gato1.raca = "Siamês";
	        gato1.idade = 3;

	        A_Gato gato2 = new A_Gato();
	        gato2.nome = "Frajola";
	        gato2.raca = "Vira-lata";
	        gato2.idade = 5;

	        gato1.mostrarInformacoes();
	        gato1.miar();
	        gato1.comer();

	        System.out.println("--------------------");

	        gato2.mostrarInformacoes();
	        gato2.miar();
	        gato2.comer();
	    }
	}
