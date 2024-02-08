package cs2670.test;

import cs2670.doubly.DLL;

public class DLLTester {
    public static void main(String[] args) {
        System.out.println("\n--- DLL Test Cases ---");
        testSize();
        testFirsts();
        testLasts();



    }

    public static void testSize() {
        DLL<String> s = new DLL<>();
        System.out.println("testSize()");
        System.out.println("size[0]: " + s.size());
        System.out.println("isEmpty[true]: " + s.isEmpty());
    } // testSize

    public static void testFirsts() {
        DLL<String> s = new DLL<>();
        System.out.println("testFirsts()");
        s.addFirst("hi");
        System.out.println("first[hi]: " + s.first());
        System.out.println("size[1]: " + s.size());
        System.out.println("isEmpty[false]: " + s.isEmpty());
    } // testFirsts

    public static void testLasts() {
        DLL<String> s = new DLL<>();
        System.out.println("testLasts()");
        s.addFirst("hi");
        System.out.println("first[hi]: " + s.first());
        System.out.println("size[1]: " + s.size());
        s.addLast("bye");
        System.out.println("last[bye]: " + s.last());
        System.out.println("first[hi]: " + s.first());
        System.out.println("size[2]: " + s.size());
        System.out.println("isEmpty[false]: " + s.isEmpty());
    } // testLasts








} // DLLTester
