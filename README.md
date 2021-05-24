# Advanced Programming - Laboratory 12

## Team
Avasiloae Alexandra

Petrescu Bianca
## Tasks
```text
Reflection
Create an application to analyze and test java classes.
The application will receive as input java classes and it will display their prototypes and perform the tests specified by the @Test annotation.

The main specifications of the application are:

```
COMPULSORY
```text
The input will be a .class file, located anywhere in the file system.
Load the specified class in memory, identifying dynamically its package.
Using reflection, extract as many information about the class (at least its methods).
Using reflection, invoke the static methods, with no arguments, annotated with @Test.
```
OPTIONAL
```text
The input will be a .class file, located anywhere in the file system.
Load the specified class in memory, identifying dynamically its package.
Using reflection, extract as many information about the class (at least its methods).
Using reflection, invoke the static methods, with no arguments, annotated with @Test.
```

## Solved tasks

As of today (24.05.2021), we have solved all tasks regarding the compulsory part.

## Build and run

To compile and run my project I have typed the following commands in the terminal:
```bash
javac -classpath . *.java Main.java
java compulsory.Main
```

## Output

The output is:
```bash
Clasa are urmatoarele proprietati:
1.Package : compulsory.TestClass
2.Variabile: 
static int compulsory.TestClass.TestClasses.variabila_statica
3.Constructori: 
public compulsory.TestClass.TestClasses()
4.Metode: 
public static void compulsory.TestClass.TestClasses.test1()
public static void compulsory.TestClass.TestClasses.test2(int)


INVOKE
test1
Apel test1
```