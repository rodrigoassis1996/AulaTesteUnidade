import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TesteCalculadora {
    @Test
    public void testaCargoInvalido(){
        Funcionario func = new Funcionario("Rodrigo", 2000, Cargo.ANALISTA_SISTEMA);
        try{
            CalculadoraDeSalario.calculaSalario(func);
            fail("Era esperado o levantamento da exceção: Funcionário inválido");
        }catch (Exception e){
            assertEquals(e.getMessage(), "Funcionário inválido");
        }
    }

    @Test
    public void testarCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite(){
        Funcionario func = new Funcionario("João", 2000, Cargo.DESENVOLVEDOR);
        assertEquals(CalculadoraDeSalario.calculaSalario(func), 1800, 0);
    }

    @Test
    public void testarCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite(){
        Funcionario func = new Funcionario("Maria", 4000, Cargo.DESENVOLVEDOR);
        assertEquals(CalculadoraDeSalario.calculaSalario(func), 3200,0);
    }

    @Test
    public void testarCalcularSalarioParaDBAsComSalarioAbaixoDoLimite(){
        Funcionario func = new Funcionario("Renata", 2000, Cargo.DBA);
        assertEquals(CalculadoraDeSalario.calculaSalario(func), 1700, 0);
    }

    @Test
    public void testarCalcularSalarioParaDBAsComSalarioAcimaDoLimite(){
        Funcionario func = new Funcionario("Renan", 2600, Cargo.DBA);
        assertEquals(CalculadoraDeSalario.calculaSalario(func), 1950, 0);
    }

    @Test
    public void testarCalcularSalarioParaArquitetosComSalarioAbaixoDoLimite(){
        Funcionario func = new Funcionario("Renata", 2000, Cargo.DBA);
        assertEquals(CalculadoraDeSalario.calculaSalario(func), 1700, 0);
    }

    @Test
    public void testarCalcularSalarioParaArquitetosComSalarioAcimaDoLimite(){
        Funcionario func = new Funcionario("Renan", 2600, Cargo.DBA);
        assertEquals(CalculadoraDeSalario.calculaSalario(func), 1950, 0);
    }
}
