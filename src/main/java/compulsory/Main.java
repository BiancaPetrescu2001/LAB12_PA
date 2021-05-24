package compulsory;

import compulsory.TestClass.TestClasses;

import java.io.File;
import java.net.MalformedURLException;

public class Main {

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException {
        /**
         * Compulsory
         */
        ClassAnalyzer solver = new ClassAnalyzer();
        ClassLoader classLoader = TestClasses.class.getClassLoader();
        File file = new File("C:\\Users\\Utilizator\\Desktop\\PA_LAB12\\src\\main\\java\\compulsory\\TestClass");
        try {
            Class aClass = classLoader.loadClass("compulsory.TestClass.TestClasses");
            solver.info(aClass);
            solver.invoke(aClass);
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        }

    }
}
