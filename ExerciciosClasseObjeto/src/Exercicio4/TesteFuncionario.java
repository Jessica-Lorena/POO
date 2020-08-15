package Exercicio4;

public class TesteFuncionario {
	public static void main(String[] args) 
	{
		/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
		 *em seguida crie um objeto funcionário, defina as instancias deste objeto e 
		 *apresente as informações deste objeto no console*/
		
		Funcionario funcionario1 = new Funcionario("João Pereira", 46852970);
		funcionario1.salario();
		System.out.println(funcionario1.getinfo());
	}

}
