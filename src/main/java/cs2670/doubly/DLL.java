package cs2670.doubly;

public class DLL<E> {

    private Node<E> head;
    private Node<E> tail;
    private int counter;

    public DLL<E>() {


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

    public void addFirst() {

    } // addFirst

    public void addLast() {

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
