package Exercicio6;

public class TesteContaBancaria {
	public static void main(String[] args) 
	{
		/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e 
		 * apresente as informações deste objeto no console.*/
		
		ContaBancaria contaBancaria1 = new ContaBancaria("Gabriel Pereira", 438348654, 16578, 2154.56, 604.79);
		System.out.println(contaBancaria1.getinfo());
	}

}
