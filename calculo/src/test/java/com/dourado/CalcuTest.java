// Define o pacote onde essa classe está localizada
package com.dourado;

//Importa o método assertEquals
import static org.junit.jupiter.api.Assertions.assertEquals;

//Importa a anotação @Test, que indica que este método é um teste
import org.junit.jupiter.api.Test;

public class CalcuTest {

//Cria um objeto da classe Calculadora para poder usar seus métodos
     Calculadora calc = new Calculadora();

    @Test
 //Verifica se a soma está funcionando corretamente
    public void sum() {
        assertEquals(2, calc.add(1, 1));
    }
}
