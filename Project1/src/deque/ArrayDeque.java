package deque;

import java.util.Iterator;

public class ArrayDeque<T> implements Iterable<T>, Deque<T>{
    // Define any class attributes here

    public ArrayDeque(){
       // Fill in constructor
    }

    public static class ArrayDequeIterator<T> implements Iterator<T> {
        // Define any attributes and constructors for the iterator here

        public boolean hasNext(){
            // TODO
            return false;
        }

        public T next(){
            // TODO
            return null;
        }
    }

    public void addFirst(T value){
        // TODO
    }

    public void addLast(T value){
        // TODO
    }

    public T removeFirst(){
        // TODO
        return null;
    }

    public T removeLast(){
        // TODO
        return null;
    }

    public boolean isEmpty(){
        // TODO
        return false;
    }

    public int size(){
        // TODO
        return -1;
    }

    public T get(int i){
        // TODO
        return null;
    }

    public void printDeque(){
        // TODO. Not required but good for debugging implementation.
        return;
    }

    public ArrayDequeIterator<T> iterator(){
        // TODO. Return ArrayDequeIterator object
        return null;
    }
}
