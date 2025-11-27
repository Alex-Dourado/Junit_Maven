🧮 **Projeto Calculadora em Java com Testes (JUnit)**

Este projeto é uma Calculadora simples em Java, criada com o objetivo de praticar programação orientada a objetos e testes automatizados com JUnit 5.

🚀 # **Funcionalidades**

✅ Soma de dois números

✅ Estrutura pronta para extensão (novas operações)

✅ Testes automatizados com JUnit

✅ Projeto gerenciado com Maven


🛠️ **Tecnologias Utilizadas**

Java 21

JUnit 5

Maven

VS Code

📂 **Estrutura do Projeto**

src
 └── main
     └── java
         └── com.dourado
             └── Calculadora.java

 └── test
     └── java
         └── com.dourado
             └── CalcuTest.java

🧪 **Exemplo de Código**

Classe Calculadora:
public int add(int a, int b) {
    return a + b;
}

**Teste Automatizado:**

@Test
public void sum() {
    assertEquals(2, calc.add(1, 1));
