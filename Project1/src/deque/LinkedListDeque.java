package deque;

import java.util.Iterator;

public class LinkedListDeque<T> implements Iterable<T>, Deque<T>{
    private class ListNode<T> {
        // Define any ListNode attributes and constructors here.
    }

    public class LinkedListDequeIterator<T> implements Iterator<T>{
        // Define any attributes and constructors for the iterator object here.

        public boolean hasNext(){
            // TODO
            return false;
        }

        public T next(){
            // TODO
            return null;
        }
    }

    // Define any LinkedListDeque attributes and constructors here.

    @Override
    public void addFirst(T value){
        // TODO
    }

    @Override
    public void addLast(T value){
       // TODO
    }

    @Override
    public boolean isEmpty(){
        // TODO
        return false;
    }

    @Override
    public int size(){
        // TODO
        return -1;
    }

    @Override
    public T removeFirst(){
        // TODO
        return null;
    }
    @Override
    public T removeLast(){
        // TODO
        return null;
    }

    @Override
    public T get(int index){
       // TODO
        return null;
    }

    @Override
    public void printDeque(){
        // TODO. Not required but good for debugging
    }

    public LinkedListDequeIterator<T> iterator(){
        // TODO
        return null;
    }
}
