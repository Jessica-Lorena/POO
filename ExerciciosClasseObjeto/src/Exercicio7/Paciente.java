package Exercicio7;

public class Paciente {
	/*Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto paciente, defina as instancias deste objeto e 
	 * apresente as informações deste objeto no console.*/
	
	private String nomePaciente;
	private String convenioPaciente;
	private int senhaPaciente;
	private String sintomaPaciente;
	private String nomeMedico;
	private int crmMedico;
	private String diagnosticoPaciente;
	
	public Paciente(String NomeP,String Convenio,int Senha,String Sintoma,String NomeM, int CRM, String Diagnostico)
	{
		nomePaciente = NomeP;
		convenioPaciente = Convenio;
		senhaPaciente = Senha;
		sintomaPaciente = Sintoma;
		nomeMedico = NomeM;
		crmMedico = CRM;
		diagnosticoPaciente = Diagnostico;
	}
	public String getespera()
	{
		String espera ="Paciente: "+nomePaciente+"\nConvênio: "+convenioPaciente+"\nSenha: "+senhaPaciente;
		return espera;
	}
	public String getconsulta()
	{
		String consulta ="Sintoma: "+sintomaPaciente+"\nMédico: "+nomeMedico+"\nCRM: "+crmMedico+"\nDiagnóstico: "+diagnosticoPaciente;
		return consulta;
	}

}
