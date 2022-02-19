
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyCalculadoraTest2 {

	@Test
	public void testCalculo() {
		
		Calculadora estaCalculadora = new MyCalculadora ();
		int res = estaCalculadora.Calculo("1 2 + 4 * 3 +");
		
		assertEquals(15,res);
		}


}
