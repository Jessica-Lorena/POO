package Exercicio5;

public class TestePatinete {
	public static void main(String[] args) 
	{
		Patinete patinete1 = new Patinete("Roxo", "Eletrico", 250);
		patinete1.velocidadeAtual = 0;
		
		System.out.println(patinete1.getinfo());
		
		patinete1.inicia();
		patinete1.acelera(20);
		System.out.println("Velocidade do patinete(km/h): " + patinete1.velocidadeAtual);
		patinete1.velocidade();
	}

}
