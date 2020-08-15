package Exercicio3;

public class ProdutoEletronico {
	/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
	 *em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e 
	 *apresente as informações deste objeto no console.*/
	
	String corPE;
	int codigoPE;
	int voltagemPE;
	int vidaUtilPE;
	double pesoPE;
	String nomeComumPE;
	
	public ProdutoEletronico(String Cor, int Codigo, int Voltagem, int VidaUtil, double Peso, String Nome)
	{
		corPE = Cor;
		codigoPE = Codigo;
		voltagemPE = Voltagem;
		vidaUtilPE = VidaUtil;
		pesoPE = Peso;
		nomeComumPE = Nome;
	}
	public String getInfo()
	{
		String Info = "Cor: "+corPE+"\nCódigo: "+codigoPE+"\nVoltagem: "+voltagemPE+"\nVida útil(anos): "+vidaUtilPE+"\nPeso(kg): "+pesoPE+"\nNome: "+nomeComumPE;
		return Info;
	}

}
