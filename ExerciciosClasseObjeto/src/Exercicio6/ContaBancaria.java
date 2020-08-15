package Exercicio6;

public class ContaBancaria {
	/*Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.*/
	
	private String nomeCliente;
	private long cpfCliente;
	private int agenciaCliente;
	private double debitoCliente;
	private double poupancaCliente;
	
	public ContaBancaria (String Nome, long CPF, int Agencia, double Debito, double Poupanca)
	{
		nomeCliente = Nome;
		cpfCliente = CPF;
		agenciaCliente = Agencia;
		debitoCliente = Debito;
		poupancaCliente = Poupanca;
	}
	public String getinfo()
	{
		String info ="Nome: "+nomeCliente+"\nCPF: "+cpfCliente+"\nAgência: "+agenciaCliente+"\nDébito: "+debitoCliente+"\nPoupança: "+poupancaCliente;
		return info;
	}

}
