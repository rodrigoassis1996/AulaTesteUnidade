public class CalculadoraDeSalario
{
  public static double calculaSalario(Funcionario funcionario)
  {
    if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR))
    {
      return dezOuVintePorCentoDeDesconto(funcionario);
    } else if (funcionario.getCargo().equals(Cargo.DBA) ||
        funcionario.getCargo().equals(Cargo.TESTADOR))
    {
      return quinzeOuVinteCincoPorCentoDeDesconto(funcionario);
    }
    throw new RuntimeException("Funcionário inválido");
  }

  private static double quinzeOuVinteCincoPorCentoDeDesconto(Funcionario funcionario)
  {
    if (funcionario.getSalarioBruto() < 2500)
    {
      return funcionario.getSalarioBruto() * 0.85;
    }
    return funcionario.getSalarioBruto() * 0.75;
  }

  private static double dezOuVintePorCentoDeDesconto(Funcionario funcionario)
  {
    if (funcionario.getSalarioBruto() > 3000)
    {
      return funcionario.getSalarioBruto() * 0.8;
    }
    return funcionario.getSalarioBruto() * 0.9;
  }
}