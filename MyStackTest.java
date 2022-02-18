package Tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyStackTest {

	@Test
	public void TestPush() {
		Stack nuevostack = new MyStack();
		
		nuevostack.Push(4);
		
		assertEquals(nuevostack.peek() ,4);
	}
	
	public void TestPop() {
		Stack nuevostack = new MyStack();
		nuevostack.Push(3);
		nuevostack.Push(2);
		nuevostack.Pop();
		assertEquals(nuevostack.peek() ,3);

	}

}
