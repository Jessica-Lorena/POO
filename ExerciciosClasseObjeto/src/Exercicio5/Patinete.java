package Exercicio5;

public class Patinete {
	/*Crie uma classe patinete e apresente os atributos e métodos referentes esta classe, 
	 *em seguida crie um objeto patinete, defina as instancias deste objeto e 
	 *apresente as informações deste objeto no console.*/
	
	String corPatinete;
	String modeloPatinete;
	int potenciaPatinete;
	double velocidadeAtual;
	
	public Patinete(String Cor, String Modelo, int Potencia)
	{
		corPatinete = Cor;
		modeloPatinete = Modelo;
		potenciaPatinete = Potencia;
	}
	public String getinfo()
	{
		String info = "Cor: "+corPatinete+"\nModelo: "+modeloPatinete+"\nPotência(W): "+potenciaPatinete;
		return info;
	}
	void inicia()
	{
		System.out.println("O patinete está ligado");
	}
	void acelera(double quantidade)
	{
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}
	void velocidade()
	{
		if(velocidadeAtual<0)
		{
			System.out.println("Verifique a bateria");
		}
		if(velocidadeAtual>0 && velocidadeAtual<10)
		{
			System.out.println("O patinete está saindo do lugar");
		}
		if(velocidadeAtual>10 && velocidadeAtual<25)
		{
			System.out.println("O patinete está ganhando velocidade");
		}
		if(velocidadeAtual>25 && velocidadeAtual<30)
		{
			System.out.println("O patinete está a toda potência");
		}
	}

}
