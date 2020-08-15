package Exercicio2;

public class Aviao {
	/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
	 *defina as instancias deste objeto e apresente as informações deste objeto no console.*/
	
	String corAviao;
	String modeloAviao;
	double velocidadeAtual;
	
	public Aviao(String Cor, String Modelo)
	{
		corAviao = Cor;
		modeloAviao = Modelo;
	}
	
	void inicia()
	{
		System.out.println("O avião está ligado");
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
			System.out.println("Nada aconteceu");
		}
		if(velocidadeAtual>0 && velocidadeAtual<60)
		{
			System.out.println("O avião está taxiando");
		}
		if(velocidadeAtual>60 && velocidadeAtual<280)
		{
			System.out.println("O avião está em decolagem");
		}
		if(velocidadeAtual>280 && velocidadeAtual<850)
		{
			System.out.println("O avião está em voo de cruzeiro");
		}
	}

}
