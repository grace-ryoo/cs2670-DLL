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
        */
        testClone();
        testCloneAgain();
    }

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
        System.out.println("\ntestClone()");
        s.addFirst(1);
        s.addFirst(2);
        s.addFirst(3);
        s.addLast(4);
        String sf = "null < - - 3 < - - > 2 < - - > 1 < - - > 4 - - > null";
        System.out.println("toString[" + sf + "]: " + s.toString());
        System.out.println("clone[" + sf + "]: " + s.clone());
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
        System.out.println("toString[" + sf + "]: " + s.toString());
        System.out.println("clone[" + sf + "]: " + shallow);
        s.addLast("done");
        System.out.println(shallow);
    } // testCloneAgain






} // DLLTester
