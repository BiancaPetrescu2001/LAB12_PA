package compulsory.TestClass;


import compulsory.Test;

import java.util.List;

/**
 * Clasa de test
 */

@Test
public class TestClasses {
    @Test
    static int variabila_statica;

    @Test
    public TestClasses(){

    }

    @Test
    public static void test1(){
        System.out.println("Apel test1");
    }
    @Test
    public static void test2(int number){
        System.out.println("Apel test 2");
    }
}
