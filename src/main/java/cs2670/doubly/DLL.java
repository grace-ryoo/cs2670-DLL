package cs2670.doubly;

public class DLL<E> {

    private Node<E> head;
    private Node<E> tail;
    private int counter;

    private class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node() {


        }

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> prev, Node<E> next) {
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

    public DLL() {
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
        Node<E> temp = new Node<E>(element);
        if (isEmpty() == true) {
            this.head = temp;
            this.tail = temp;
        } else {
            temp.setNext(this.head);
            this.head.setPrev(temp);
            this.head = temp;
        } // if
        this.counter++;
    } // addFirst

    public void addLast(E element) {
        Node<E> temp = new Node<E>(element);
        if (isEmpty() == true) {
            this.tail = temp;
            this.head = temp;
        } else {
            temp.setPrev(this.tail);
            this.tail.setNext(temp);
            this.tail = temp;
        } // if
        this.counter++;
    } // addLast

    public E removeFirst() {
        if (isEmpty() == true) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list.");
        } else {
            Node<E> removing = this.head;
            this.head = removing.getNext();
            this.head.setPrev(null);
            this.counter--;
            return removing.getElement();
        } // if
    } // removeFirst

    public E removeLast() {
        if (isEmpty() == true) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list.");
        } else {
            Node<E> removing = this.tail;
            this.tail = removing.getPrev();
            this.tail.setNext(null);
            this.counter--;
            return removing.getElement();
        } // if
    } // removeLast

    public String toString() {
        String printing = "null";
        if (isEmpty() == true) { // no elements
            return printing;
        } else {
            Node<E> pointer = this.head;
            while (pointer != null) {
                if (pointer == this.head) { // first element
                    printing += " < - - " + pointer.getElement();
                } else { // middle element
                    printing += " < - - > " + pointer.getElement();
                } // if
                pointer = pointer.getNext();
            } // while
            printing += " - - > null";
        } // if
        return printing;
    } // toString

    public DLL<E> clone() {
        if (isEmpty() == true) {
            return null;
        } // if
        DLL<E> cloned = new DLL<E>();
        Node<E> ogPointer = this.head;
        while (ogPointer != null) {
            Node<E> newNd = new Node<>(ogPointer.getElement(), null, null);
            if (cloned.isEmpty() == true) { // first element
                cloned.head = newNd;
                cloned.tail = newNd;
            } else { // not first element
                cloned.tail.setNext(newNd);
                newNd.setPrev(cloned.tail);
                cloned.tail = newNd;
            } // if
            ogPointer = ogPointer.getNext();
        } // while
        cloned.counter = this.counter;
        return cloned;
    } // clone

    public DLL<E> deepClone() {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // deepClone

    public void insert(int index, E Element) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // insert

    public E get(int index) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // get

    public E remove(int index) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // remove

    public void remove(Node<E> x) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // remove

    public Node<E> find(E element) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // find

    public void swap(Node<E> x, Node<E> y) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // swap

    public void clear() {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // clear

    public E set(int index, E element) {
        throw new UnsupportedOperationException("Method is not implemented yet.");
    } // set




} // DLL
