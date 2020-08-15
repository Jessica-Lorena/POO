package Exercicio3;

public class TestePE {
	public static void main(String[] args) 
	{
		/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
		 *em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e 
		 *apresente as informações deste objeto no console.*/
		
		ProdutoEletronico PE1 = new ProdutoEletronico("Cinza", 562120, 110, 10, 5.8, "AirFryer");
		System.out.println(PE1.getInfo());
		
	}

}
