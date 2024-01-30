package cs2670.doubly;

public class Node<E> {

    private E element;
    private Node<E> prev;
    private Node<E> next;

    public Node<E>() {


    }

    public Node<E>(E element) {


    }

    public Node<E>(E element, Node<E> prev, Node<E> next) {


    }

    public void setElement(E element) {
        this.element = element;
    } // setElement

    public void setPrev(Node<E> prev) {
        this.prev = prev;
    } // setPrev

    public void setNext(Node<E> next) {
        this.next = next;
    } // setNext

    public E getElement() {
        return element;
    } // getElement

    public Node<E> getPrev() {
        return prev;
    } // getPrev

    public Node<E> getNext() {
        return next;
    } // getNext











} // Node
