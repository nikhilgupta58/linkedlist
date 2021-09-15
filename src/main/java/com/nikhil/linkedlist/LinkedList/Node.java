package com.nikhil.linkedlist.LinkedList;

public class Node<T> {

    private T data;
    private Node<T> next;
    private Node<T> prev;

    Node(T data) {
        this.data = data;
        this.next = null;
        this.next = null;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
        this.prev = null;
    }

    Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public Node<T> getPrev() {
        return this.prev;
    }

    void setNext(Node<T> next) {
        this.next = next;
    }

    void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    void setData(T data) {
        this.data = data;
    }
}