package com.nikhil.linkedlist.LinkedList;
import java.util.*;
import com.nikhil.linkedlist.Iterator.*;

public class DoublyLinkedList<T> implements LinkedList<T>, Iterable<T> {

    private Node<T> head, tail;
    private int size;

    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(this);
    }

    public Node<T> getHead() {
        return head;
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        this.size+=1;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        this.size+=1;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    public boolean search(T data) {
        Node<T> t = head;
        while(t!=null){
            if(t.getData()==data)
                return true;
            t = t.getNext();
        }
        return false;
    }

    public boolean insert(int index, T data) {
        if(index>size && index<=0)
            return false;
        int it=0;
        Node<T> t = head;
        Node<T> newNode = new Node<>(data);
        while (it!=index-1 && t!=null){
            t = t.getNext();
            it+=1;
        }
        if(t!=null) {
            newNode.setNext(t.getNext());
            t.setNext(newNode);
        }
        size+=1;
        return true;
    }

    public boolean setAt(int index, T data) {
        if(index>size || index<0)
            return false;
        Node<T> t = head;
        int it=0;
        while (it!=index && t!=null){
            it+=1;
            t =t.getNext();
        }
        if(t!=null) {
            t.setData(data);
            return true;
        }
        return  false;
    }

    public boolean removeAt(int index) {
        if(index>size || index<0)
            return  false;
        if(head.getNext()==null) {
            head = null;
            size-=1;
            return  true;
        }
        if(index==0) {
            head = head.getNext();
            size-=1;
            return  true;
        }
        Node<T> t= head;
        int it=0;
        while (it!=index-1 && t!=null){
            t=t.getNext();
            it+=1;
        }
        if(t!=null) {
            t.setNext(t.getNext().getNext());
            size -= 1;
            return true;
        }
        return  false;
    }

    public boolean remove(T data) {
        if (head.getData() == data) {
            head = head.getNext();
            size-=1;
            return true;
        }
        Node<T> t = head;
        while (t.getNext() != null) {
            if( t.getNext().getData() == data)
                break;
            t = t.getNext();
        }
        if(t.getNext()==null)
            return false;
        if (t.getNext().getData() == data) {
            size-=1;
            t.setNext(t.getNext().getNext());
            return true;
        }
        return false;
    }

    public void reverse() {
        DoublyLinkedList<T> newNode = new DoublyLinkedList<>();
        Node<T> t = head;
        while (t!=null){
            newNode.push(t.getData());
            t=t.getNext();
        }
        this.head = newNode.getHead();
    }

    public String toString() {
        StringBuilder s = new StringBuilder("{ ");
        Node<T> t = head;
        if(head==null)
            return  "{}";
        while (t.getNext() != null) {
            s.append(t.getData()).append(" ");
            t = t.getNext();
        }
        s.append(t.getData()).append(" }");
        return s.toString();
    }

    public boolean equals(LinkedList<T> obj) {
        if(obj.size()!=this.size)
            return  false;
        Node<T> t = head;
        Node<T> t1 = obj.getHead();
        while(t!=null){
            if(t.getData()!=t1.getData())
                return  false;
            t = t.getNext();
            t1=t1.getNext();
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head=tail=null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Object[] toArray() {
        Object[] arr = new Object[size()];
        int index=0;
        Node<T> t = head;
        while(t!=null){
            arr[index] = t.getData();
            index+=1;
            t = t.getNext();
        }
        return arr;
    }
}