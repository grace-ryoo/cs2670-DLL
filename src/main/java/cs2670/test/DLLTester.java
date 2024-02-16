package cs2670.test;

import cs2670.doubly.DLL;


public class DLLTester {
    public static void main(String[] args) {
        System.out.println("\n--- DLL Test Cases ---");
        /**
        testSize();
        testFirsts();
        testLasts();
        testToString();
        testRemoveFirst();
        testRemoveLast();
        testInsert();
        testGet();
        testRemove1();
        testFind();
        testClear();
        testSet();
        testClone();
        testCloneAgain();
        testClone3();
        testClone4();
        testRemove2();
        testSwap();
        */




    } // main

    public static void testSwap() {
        DLL<Integer> s = new DLL<>();
        s.addLast(1);
        s.addLast(10);
        s.addLast(100);
        s.addLast(300);
        System.out.println(s);
        s.swap(s.find(1),s.find(100));
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.size());
    } // testSwap

    public static void testSize() {
        DLL<String> s = new DLL<>();
        System.out.println("\ntestSize()");
        System.out.println("size[0]: " + s.size());
        System.out.println("isEmpty[true]: " + s.isEmpty());
    } // testSize

    public static void testFirsts() {
        DLL<String> s = new DLL<>();
        System.out.println("\ntestFirsts()");
        s.addFirst("hi");
        System.out.println("first[hi]: " + s.first());
        System.out.println("size[1]: " + s.size());
        System.out.println("isEmpty[false]: " + s.isEmpty());
    } // testFirsts

    public static void testLasts() {
        DLL<String> s = new DLL<>();
        System.out.println("\ntestLasts()");
        s.addFirst("hi");
        System.out.println("first[hi]: " + s.first());
        System.out.println("size[1]: " + s.size());
        s.addLast("bye");
        System.out.println("last[bye]: " + s.last());
        System.out.println("first[hi]: " + s.first());
        System.out.println("size[2]: " + s.size());
        System.out.println("isEmpty[false]: " + s.isEmpty());
        System.out.println("toString[null < - - hi < - - > bye - - > null]: " + s.toString());
    } // testLasts

    public static void testToString() {
        DLL<Integer> s = new DLL<>();
        System.out.println("\ntestToString()");
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addLast(100);
        s.addLast(1000);
        String sf = "null < - - 3 < - - > 2 < - - > 1 < - - > 100 < - - > 1000 - - > null";
        System.out.println("last[1000]: " + s.last());
        System.out.println("first[3]: " + s.first());
        System.out.println("size[5]: " + s.size());
        System.out.println("toString[" + sf + "]: " + s.toString());
    } // testToString

    public static void testRemoveFirst() {
        DLL<Integer> s = new DLL<>();
        System.out.println("\ntestRemoveFirst()");
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addLast(100);
        s.addLast(1000);
        String sf = "null < - - 3 < - - > 2 < - - > 1 < - - > 100 < - - > 1000 - - > null";
        String sf2 = "null < - - 2 < - - > 1 < - - > 100 < - - > 1000 - - > null";
        System.out.println("first[3]: " + s.first());
        System.out.println("size[5]: " + s.size());
        System.out.println("toString[" + sf + "]: " + s.toString());
        System.out.println("removeFirst[3]: " + s.removeFirst());
        System.out.println("toString[" + sf2 + "]: " + s.toString());
        System.out.println("size[4]: " + s.size());
    } // testRemoveFirst

    public static void testRemoveLast() {
        DLL<Integer> s = new DLL<>();
        System.out.println("\ntestRemoveLast()");
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addLast(100);
        s.addLast(1000);
        String sf = "null < - - 3 < - - > 2 < - - > 1 < - - > 100 < - - > 1000 - - > null";
        String sf2 = "null < - - 3 < - - > 2 < - - > 1 < - - > 100 - - > null";
        System.out.println("last[1000]: " + s.last());
        System.out.println("size[5]: " + s.size());
        System.out.println("toString[" + sf + "]: " + s.toString());
        System.out.println("removeLast[1000]: " + s.removeLast());
        System.out.println("toString[" + sf2 + "]: " + s.toString());
        System.out.println("size[4]: " + s.size());
    } // testRemoveLast

    public static void testClone() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addLast(4);
        String sf = "null < - - 3 < - - > 2 < - - > 1 < - - > 4 - - > null";
        DLL<Integer> shallow = s.clone();
        System.out.println(s.equals(shallow));
    } // testClone

    public static void testCloneAgain() {
        DLL<String> s = new DLL<>();
        System.out.println("\ntestCloneAgain()");
        s.addLast("hi");
        s.addFirst("how");
        s.addLast("are");
        s.addFirst("you");
        s.addFirst("yay");
        String sf = "null < - - yay < - - > you < - - > how < - - > hi < - - > are - - > null";
        DLL<String> shallow = s.clone();
        System.out.println(s.equals(shallow));
    } // testCloneAgain

    public static void testInsert() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.insert(1, 100);
        String sf = "null < - - 3 < - - > 100 < - - > 2 < - - > 1 - - > null";
        if (s.toString().equals(sf)) {
            System.out.println("testInsert(): test passed");
        } else {
            System.out.println("testInsert(): test failed");
            System.out.println(s.toString());
        } // if
    } // testInsert

    public static void testGet() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        if (s.get(0).equals(3)) {
            System.out.println("testGet(): test passed");
        } else {
            System.out.println("testGet(): test failed");
            System.out.println(s.get(0));
        } // if
    } // testGet

    public static void testRemove1() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        String sf = "null < - - 2 < - - > 1 - - > null";
        System.out.println(s.remove(0));
        System.out.println(s.remove(0));
        System.out.println(s.remove(0));
        System.out.println(s.toString());
    } // testRemove1

    public static void testRemove2() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.remove(s.find(3));
        System.out.println(s);
        s.remove(s.find(1));
        System.out.println(s);
        System.out.println(s.size());
    } // testRemove2

    public static void testFind() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        System.out.println(s.find(3));
        System.out.println(s.find(4));
    } // testFind

    public static void testClear() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.clear();
        System.out.println(s);
        System.out.println(s.size());
    } // testClear

    public static void testSet() {
        DLL<Integer> s = new DLL<>();
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        System.out.println(s.set(0,100));
        System.out.println(s.size());
        System.out.println(s);
    } // testSet

    public static void testClone3() {
        DLL<Integer> s = new DLL<>();
        s.addLast(1);
        s.addLast(2);
        DLL<Integer> sc = s.clone();
        System.out.println(sc);
        System.out.println(sc.size());
        System.out.println(sc.first());
        System.out.println(sc.last());
        System.out.println(sc.equals(s));
    } // testClone3

    public static void testClone4() {
        DLL<Integer> s = new DLL<>();
        s.addLast(1);
        s.addLast(2);
        DLL<Integer> copy = s.clone();
        s.addLast(3);
        System.out.println(copy);
        System.out.println(copy.size());
        s.insert(1,300);
        System.out.println(copy);
        System.out.println(copy.size());
        copy.remove(0);
        System.out.println(copy);
        System.out.println(copy.size());

    } // testClone4


} // DLLTester
