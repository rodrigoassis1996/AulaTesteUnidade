import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TesteCalculadoraSalario
{
	@Test
	public void testarCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite(){
		Funcionario  f = new Funcionario("João", 2000, Cargo.DESENVOLVEDOR);
		assertEquals(1800,f.getSalarioLiquido(),1800);
		assertEquals(1800, CalculadoraDeSalario.calculaSalario(f),0);

		f = new Funcionario("João", 3000, Cargo.DESENVOLVEDOR);
		assertEquals(1800,f.getSalarioLiquido(),1800);
		assertEquals(1800, CalculadoraDeSalario.calculaSalario(f),0);
	}
	

}

