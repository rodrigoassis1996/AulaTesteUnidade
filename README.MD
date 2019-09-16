Problema do Cálculo de Salário: 
  - Cada funcionário possui nome, salário bruto, salário líquido e cargo. 
  - O cargo é representado por uma enumeração. (Desenvolvedor, Testador, DBA e Analista de Sistemas)
 
 As regras de negócio são as seguintes:
   - Desenvolvedores possuem 20% de desconto caso seu salário sejamaior do que R$ 3000,0. 
     Caso contrário, o desconto é de 10%.
   
   - DBAs e testadores possuem desconto de 25% se seus salários forem maiores do que R$ 2500,0.
    Caso contrário, o desconto é de 15%.
    
Exercício:

1) Implemente os seguintes testes de unidade:

 - testarCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite()
 - testarCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite()
 - testarCalcularSalarioParaDBAsComSalarioAbaixoDoLimite()
 - testarCalcularSalarioParaDBAsComSalarioAcimaDoLimite()
 - testarCalcularSalarioParaTestadoresComSalarioAbaixoDoLimite()
 - testarCalcularSalarioParaTestadoresComSalarioAcimaDoLimite()
 - testarCalcularSalarioParaAnalistaDeSistemaComSalarioAbaixoDoLimite()
 - testarCalcularSalarioParaAnalistaDeSistemaComSalarioAcimaDoLimite()