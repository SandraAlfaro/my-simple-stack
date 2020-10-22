package deqo.salf.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStackTest {

    @Test
    public void testIsEmpty() {
        ISimpleStack stack = new SimpleStack();
        assertTrue ("A new stack should be empty ", stack.isEmpty());
        assertEquals ("A new stack has no element " ,0 , stack.getSize());
    }

    @Test
    public void testPush() {
        ISimpleStack stack = new SimpleStack();
        Item item = new Item();
        stack.push(item);
        assertFalse ("The stack must be not empty ", stack.isEmpty());
        assertEquals ("The stack should contain 1 item ",1, stack.getSize());
        assertSame ("Pushed item should be on top of stack ", item , stack.peek());
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testPopOnEmptyStack () throws IndexOutOfBoundsException {
        ISimpleStack stack = new SimpleStack();
        stack.pop(); //Should throws an EmptyStackException
    }
}