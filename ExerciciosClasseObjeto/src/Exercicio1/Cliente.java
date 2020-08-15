package Exercicio1;

import java.util.Scanner;

public class Cliente {
	/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto cliente, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.*/
	
	Scanner ler = new Scanner(System.in);
	double vp, vt; //vp = valor do produto, vt = valor total
	
	private String nomeCliente;
	private int codigoCliente;
	
	public Cliente (String Nome, int Codigo)
	{
		nomeCliente = Nome;
		codigoCliente = Codigo;
	}
	
	public double valor(double vt)
	{
		System.out.println("O valor de cada produto deve ser inserido individualmente\nPara finalizar entre ou 0 ou número negativo");
		do 
		{
			System.out.println("Entre com o valor:");
			vp = ler.nextDouble();
			vt = vt + vp;
		}while (vp>0.0);
		return vt;
	}
	public String getinfo()
	{
		String info = nomeCliente + "\t" + codigoCliente;
		return info;
	}
	public void compra()
	{
		System.out.printf("Total: %.2f \n",valor(0.0));
	}
	

}
