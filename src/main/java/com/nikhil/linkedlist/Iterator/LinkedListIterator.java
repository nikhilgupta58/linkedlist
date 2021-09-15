package com.nikhil.linkedlist.Iterator;
import com.nikhil.linkedlist.LinkedList.*;
import java.util.Iterator;

public class LinkedListIterator<T> implements Iterator<T> {

    Node<T> current;

    public LinkedListIterator(LinkedList<T> obj) {
        current = obj.getHead();
    }

    public boolean hasNext() {
        return current != null;
    }

    public T next() {
        T data = current.getData();
        current = current.getNext();
        return data;
    }
}