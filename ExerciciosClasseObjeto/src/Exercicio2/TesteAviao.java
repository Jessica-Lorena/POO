package Exercicio2;

public class TesteAviao {
	public static void main(String[] args) 
	{
		/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, 
		 *defina as instancias deste objeto e apresente as informações deste objeto no console.*/
		
		Aviao aviao1 = new Aviao("Branco", "Boeing 707");
		aviao1.velocidadeAtual = 0;
		
		System.out.println(aviao1.modeloAviao + "\n" + aviao1.corAviao);
		
		aviao1.inicia();
		
		aviao1.acelera(270);
		System.out.println("Velocidade do avião(km/h): " + aviao1.velocidadeAtual);
		aviao1.velocidade();
	}

}
