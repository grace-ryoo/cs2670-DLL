#!/bin/bash -ex

javac -d bin -Xlint src/main/java/cs2670/doubly/DLL.java
javac -cp bin -d bin src/main/java/cs2670/test/DLLTester.java
java -cp bin cs2670.test.DLLTester
