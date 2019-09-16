import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Funcionario
{
  private String nome;
  private double salarioBruto;
  private double salarioLiquido;
  private Cargo cargo;

  public Funcionario(String nome, double salarioBruto, Cargo cargo)
  {
    this.nome = nome;
    this.salarioBruto = salarioBruto;
    this.cargo = cargo;
  }

  @Override
  public String toString()
  {
    return "Funcionario{" +
        "Nome= '" + nome + '\'' +
        ", Salário Bruto= " + salarioBruto +
        ", Salário Liquido= " + salarioLiquido +
        ", Cargo= " + cargo +
        '}';
  }
}


