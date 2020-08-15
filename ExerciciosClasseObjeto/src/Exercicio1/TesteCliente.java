package Exercicio1;

public class TesteCliente {
	public static void main(String[] args) 
	{
		/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto cliente, defina as instancias deste objeto e 
		 * apresente as informações deste objeto no console.*/
		
		Cliente cliente1 = new Cliente ("Ana Oliveira", 218756);
		cliente1.compra();
		System.out.println(cliente1.getinfo());
	}

}
