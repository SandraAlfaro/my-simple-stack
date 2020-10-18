package deqo.salf.mysimplestack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SimpleStack implements ISimpleStack {
    ArrayList<Item> stack = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(0,item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack.get(0);
    }

    @Override
    public Item pop() throws EmptyStackException {
        return stack.remove(0);
    }
}
