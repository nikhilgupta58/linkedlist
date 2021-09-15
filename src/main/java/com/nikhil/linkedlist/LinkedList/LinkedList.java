package com.nikhil.linkedlist.LinkedList;
import java.util.Iterator;

public interface LinkedList<T> {
    public void push(T data);

    public void append(T data);

    public boolean search(T data);

    public boolean insert(int index, T data);

    public boolean setAt(int index, T data);

    public boolean removeAt(int index);

    public boolean remove(T data);

    public void reverse();

    public String toString();

    public boolean equals(LinkedList<T> obj);

    public int size();

    public void clear();

    public boolean isEmpty();

    public Object[] toArray();

    public Node<T> getHead();

    public Iterator<T> iterator();
}