package Exercicio7;

public class TestePaciente {
	public static void main(String[] args) 
	{
		/*Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto paciente, defina as instancias deste objeto e 
		 * apresente as informações deste objeto no console.*/
		Paciente paciente1 =new Paciente("Maria Oliveira","Saúde", 407, "Dificuldade para respirar", "Jonas Silva", 75846921, "Asma");
		System.out.println(paciente1.getespera());
		System.out.println();
		System.out.println(paciente1.getconsulta());
	}

}
