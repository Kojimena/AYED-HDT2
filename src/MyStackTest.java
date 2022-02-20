import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStackTest {

	@Test
	public void TestPush() {
		Stack nuevostack = new MyStack();
		
		nuevostack.push(4);
		
		assertEquals(nuevostack.peek() ,4);
	}
	
	public void TestPop() {
		Stack nuevostack = new MyStack();
		nuevostack.push(3);
		nuevostack.push(2);
		nuevostack.pull();
		assertEquals(nuevostack.peek() ,3);

	}

}
