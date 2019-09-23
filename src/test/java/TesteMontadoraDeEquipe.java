import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TesteMontadoraDeEquipe {

    @Test
    public void testarMontadoraDeEquipeComUmArquitetoUmDBA(){
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario(
                "João", 3000, Cargo.DESENVOLVEDOR));
        funcionarios.add(new Funcionario(
                "Camila", 3100, Cargo.ARQUITETO_SISTEMA));
        funcionarios.add(new Funcionario(
                "Eduardo", 2000, Cargo.TESTADOR));
        funcionarios.add(new Funcionario(
                "Daniela", 2500, Cargo.DESENVOLVEDOR));
        funcionarios.add(new Funcionario(
                "Pedro", 2500, Cargo.DBA));

        List<Funcionario> equipes = new ArrayList<Funcionario>();

        MontadoraDeEquipe montadoraDeEquipe = new MontadoraDeEquipe(funcionarios);
        equipes = montadoraDeEquipe.montarEquipe(funcionarios);
        int arquiteto = 0;
        int dba = 0;

        Iterator it = equipes.iterator();
        while (it.hasNext()) {
            Funcionario funcionario = (Funcionario) it.next();
            arquiteto = (funcionario.getCargo() == Cargo.ARQUITETO_SISTEMA) ? (arquiteto++) : arquiteto;
            dba = (funcionario.getCargo() == Cargo.DBA) ? dba++ : dba;
        }

        assertEquals(1, arquiteto);
        assertEquals(1, dba);

    }
}
