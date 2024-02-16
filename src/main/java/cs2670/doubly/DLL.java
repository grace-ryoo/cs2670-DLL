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
        DLL<E> cloned = this;
        return cloned;
    } // clone

    public void insert(int index, E element) {
        if (index < 0 || index >= this.counter) {
            throw new IndexOutOfBoundsException("index is out of range");
        } else {
            Node<E> pointer = this.head;
            Node<E> temp = new Node<>(element);
            int idxCount = 0;
            while (pointer != null && idxCount != this.counter) {
                if (idxCount == index) {
                    temp.setPrev(pointer.getPrev());
                    temp.setNext(pointer);
                    if (pointer.getPrev() != null) {
                        pointer.getPrev().setNext(temp);
                    } // if
                    pointer.setPrev(temp);
                    if (pointer == this.head) {
                        this.head = temp;
                    } // if
                    idxCount = this.counter;
                } else {
                    pointer = pointer.getNext();
                    idxCount++;
                } // else
            } // while
            this.counter++;
        } // if
    } // insert

    public E get(int index) {
        if (index < 0 || index >= this.counter) {
            return null;
        } else {
            Node<E> pointer = this.head;
            E returned = null;
            int idxCount = 0;
            while (pointer != null && idxCount != this.counter) {
                if (idxCount == index) {
                    returned = pointer.getElement();
                    idxCount = this.counter;
                } else {
                    pointer = pointer.getNext();
                    idxCount++;
                } // if
            } // while
            return returned;
        } // if
    } // get

    public E remove(int index) {
        if (index < 0 || index >= this.counter) {
            throw new IndexOutOfBoundsException("index is out of range");
        } else {
            Node<E> pointer = this.head;
            for (int i = 0; i < index; i++) {
                pointer = pointer.getNext();
            } // for
            E removing = pointer.getElement();
            if (pointer.getPrev() != null) {
                pointer.getPrev().setNext(pointer.getNext());
            } else {
                this.head = pointer.getNext();
            } // if
            if (pointer.getNext() != null) {
                pointer.getNext().setPrev(pointer.getPrev());
            } else {
                this.tail = pointer.getPrev();
            } // if
            this.counter--;
            if (this.counter == 0) {
                this.tail = null;
            } // if
            return removing;
        } // if
    } // remove

    public void remove(Node<E> x) {
        if (x == null) {
            throw new NullPointerException("Node<E> x is null");
        } else {
            Node<E> pointer = this.head;
            while (pointer != null) {
                if (pointer.equals(x)) {
                    if (pointer.getPrev() != null) {
                        pointer.getPrev().setNext(pointer.getNext());
                    } else {
                        this.head = pointer.getNext();
                    } // if
                    if (pointer.getNext() != null) {
                        pointer.getNext().setPrev(pointer.getPrev());
                    } else {
                        this.tail = pointer.getPrev();
                    } // if
                    this.counter--;
                    if (this.counter == 0) {
                        this.tail = null;
                    } // if
                    return;
                } else {
                    pointer = pointer.getNext();
                } // if
            } // while
            throw new IllegalArgumentException("Node<E> x is not in the list");
        } // if
    } // remove

    public Node<E> find(E element) {
        if (element == null) {
            throw new NullPointerException("E element is null");
        } else {
            Node<E> pointer = this.head;
            while (pointer != null) {
                if (pointer.getElement().equals(element)) {
                    return pointer;
                } else {
                    pointer = pointer.getNext();
                } // if
            } // while
            return null;
        } // if
    } // find

    public void swap(Node<E> x, Node<E> y) {
        if (x == y || x == null || y == null) {
            return;
        } // if

        Node<E> prevTempx = x.getPrev();
        Node<E> nextTempx = x.getNext();
        Node<E> prevTempy = y.getPrev();
        Node<E> nextTempy = y.getNext();
        Node<E> temp = x;

        if (prevTempx != null) {
            prevTempx.setNext(y);
        } else {
            this.head = y;
        } // if

        if (nextTempx != null) {
            nextTempx.setPrev(y);
        } else {
            this.tail = y;
        } // if

        if (prevTempy != null) {
            prevTempy.setNext(x);
        } else {
            this.head = x;
        } // if

        if (prevTempy != null) {
            prevTempy.setNext(x);
        } else {
            this.head = x;
        } // if


        x.setPrev(prevTempy);
        x.setNext(nextTempy);
        y.setPrev(prevTempx);
        y.setNext(nextTempx);
    } // swap

    public void clear() {
        this.head = null;
        this.tail = null;
        this.counter = 0;
    } // clear

    public E set(int index, E element) {
        if (index < 0 || index >= this.counter) {
            throw new IndexOutOfBoundsException("index is out of range");
        } else if (element == null) {
            throw new NullPointerException("E element is null");
        } else {
            Node<E> pointer = this.head;
            for (int i = 0; i < index; i++) {
                pointer = pointer.getNext();
            } // for
            E returned = pointer.getElement();
            pointer.setElement(element);
            return returned;
        } // if
    } // set


} // DLL
