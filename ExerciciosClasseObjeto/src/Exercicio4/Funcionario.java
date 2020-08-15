package Exercicio4;

import java.util.Scanner;

public class Funcionario {
	/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
	 *em seguida crie um objeto funcionário, defina as instancias deste objeto e 
	 *apresente as informações deste objeto no console*/
	
	Scanner ler = new Scanner(System.in);
	
	double h, t;//h = horas, t = salario total
	
	private String nomeFuncionario;
	private int codigoFuncionario;
	
	public Funcionario (String Nome, int Codigo)
	{
		nomeFuncionario = Nome;
		codigoFuncionario = Codigo;
	}
	
	public String getinfo()
	{
		String info = nomeFuncionario + "\t" + codigoFuncionario;
		return info;
	}
	public void salario()
	{
		System.out.println("Entre com as horas trabalhadas: ");
		h = ler.nextDouble();
		t = h * 50;
		System.out.println("Total a receber: " + t);
	}

}
