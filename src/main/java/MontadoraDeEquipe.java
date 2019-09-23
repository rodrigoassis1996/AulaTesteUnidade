import java.util.Iterator;
import java.util.List;

public class MontadoraDeEquipe {

    private List<Funcionario> funcionarios;
    private List<Funcionario> equipes;

    public MontadoraDeEquipe(List listaFuncionarios) {
        this.funcionarios = listaFuncionarios;
    }

    public void mostrarDados() {
        Iterator it = funcionarios.iterator();
        while (it.hasNext()) {
            Funcionario funcionario = (Funcionario) it.next();
            System.out.println(funcionario.toString());
        }
    }

    public List<Funcionario> montarEquipe(List listaFuncionarios) {
        equipes = listaFuncionarios;
        return equipes;
    }
}
