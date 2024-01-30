package cs2670.doubly;

public class DLL<E> {

    private Node<E> head;
    private Node<E> tail;
    private int counter;

    private class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node<E>() {


        }

        public Node<E>(E element) {
            this.element = element;
        }

        public Node<E>(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
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

    } // Node<E>

    public DLL<E>() {
        this.head = null;
        this.tail = null;
        this.counter = 0;

    } // DLL<E>

    public int size() {
        return counter;
    } // size

    public boolean isEmpty() {
        return this.counter == 0;
    } // isEmpty

    public E first() {
        return head.getElement();
    } // first

    public E last() {
        return tail.getElement();
    } // last

    public void addFirst(E element) {

    } // addFirst

    public void addLast(E element) {

    } // addLast

    public E removeFirst() {

    } // removeFirst

    public E removeLast() {

    } // removeLast

    public String toString() {

    } // toString

    public DLL<E> clone() {

    } // clone

    public DLL<E> deepClone() {

    } // deepClone

    public void insert() {

    } // insert

    public E get() {


    } // get

    public E remove() {

    } // remove

    public void remove() {

    } // remove

    public Node<E> find() {

    } // find

    public void swap() {

    } // swap

    public void clear() {

    } // clear

    public E set() {

    } // set




} // DLL
