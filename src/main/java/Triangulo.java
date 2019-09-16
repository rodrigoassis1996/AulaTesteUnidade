public class Triangulo {

  public enum Resposta  {
    EQUILATERO,
    ESCALENO,
    ISOSCELES,
    EXISTE,
    NAO_TRIANGULO
  }


  public static Resposta verificaTipoTriangulo(int lado1, int lado2, int lado3) {
    if ((lado1 > 0) | (lado2 > 0) || (lado3 > 0)) {
      if ((Math.abs(lado2 - lado3)) < lado1 && lado1 < (lado2 + lado3) || (Math.abs(lado1 - lado3)) < lado2 && lado2 < (lado1 + lado3) || (Math.abs(lado1 - lado2)) < lado3 && lado3 < (lado1 + lado2)) {
        if ((lado1 == lado2) && (lado2 == lado3)) {
          return Resposta.EQUILATERO;
        }
        else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
          return Resposta.ISOSCELES;
        }
        else {
          return Resposta.ESCALENO;
        }
      }
      else {
        return Resposta.NAO_TRIANGULO;
      }
    }
    else {
      return Resposta.NAO_TRIANGULO;
    }
  }
}