import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TesteTriangulo
{
  @Test
  public void testarVerificaTrianguloEquilateroTipo1()
  {
    assertEquals(Triangulo.Resposta.EQUILATERO, Triangulo.verificaTipoTriangulo(2, 2, 2));
  }

  @Test
  public void testarVerificaTrianguloEscalenoTipo1()
  {
    assertEquals(Triangulo.Resposta.ESCALENO, Triangulo.verificaTipoTriangulo(10, 14, 8));
  }

  @Test
  public void testarVerificaTrianguloIsoscelesTipo1()
  {
    assertEquals(Triangulo.Resposta.ISOSCELES, Triangulo.verificaTipoTriangulo(4, 4, 3));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo1_1()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(5, 0, 2));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo1_2()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(0, 14, 2));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo1_3()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(2, 14, 0));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo2_1()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(0, 0, 2));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo2_2()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(2, 0, 0));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo2_3()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(0, 2, 0));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNulo3()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(0, 0, 0));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNegativo1()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(10, 14, -8));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNegativo2()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(-10, 14, -8));
  }

  @Test
  public void testarVerificaExistenciaTrianguloLadoNegativo3()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(-10, -14, -8));
  }

  @Test
  public void testarVerificaExistenciaTrianguloCondicao1_1()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(1, 3, 1));
  }

  @Test
  public void testarVerificaExistenciaTrianguloCondicao1_2()
  {
    assertEquals(Triangulo.Resposta.NAO_TRIANGULO, Triangulo.verificaTipoTriangulo(5, 2, 2));
  }


}

