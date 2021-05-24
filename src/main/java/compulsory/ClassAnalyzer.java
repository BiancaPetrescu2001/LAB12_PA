package compulsory;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.net.MalformedURLException;


public class ClassAnalyzer {

    private int failed, passed, found;

    public ClassAnalyzer() {
        this.failed = this.passed = this.found = 0;
    }

    /**
     * @param clasa Returneaza urmatoarele date despre clasa
     *              * 1. Package
     *              * 2. Variabile
     *              * 3. Metode
     *              * 4. Constructori
     */
    public void info(Class<?> clasa) {
        System.out.println("Clasa are urmatoarele proprietati:");
        if (clasa.getPackage() == null) System.out.println("\nClasa nu are pachet");
        else System.out.println("1.Package : " + clasa.getPackage().getName());
        if (clasa.getDeclaredFields().length != 0) {
            System.out.println("2.Variabile: ");
            for (Field field : clasa.getDeclaredFields())
                System.out.println(field.toString());
        }
        if (clasa.getDeclaredConstructors().length != 0) {
            System.out.println("3.Constructori: ");
            for (Constructor<?> constructor : clasa.getDeclaredConstructors())
                System.out.print(constructor.toString());
            System.out.println();
        }
        if (clasa.getDeclaredMethods().length != 0) {
            System.out.println("4.Metode: ");
            for (Method method : clasa.getDeclaredMethods())
                System.out.println(method.toString());
            System.out.println();
        }
    }

    /**
     * invoke pentru metode statice fara parametri
     * @param clasa
     */
    public void invoke(Class<?> clasa) {
        System.out.println("\nINVOKE");
        for (Method method : clasa.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                int modifiers = method.getModifiers();
                if (Modifier.isStatic(modifiers)) {
                    Parameter[] parameters = method.getParameters();
                    if (parameters.length == 0) {
                        try {
                            this.found++;
                            System.out.println(method.getName());
                            method.invoke(null);
                            this.passed++;
                        } catch (IllegalAccessException illegalAccessException) {
                            illegalAccessException.printStackTrace();
                        } catch (InvocationTargetException invocationTargetException) {
                            this.failed++;
                            System.out.println("Invoke failed" + invocationTargetException.getCause());
                        }
                    }
                }
            }
        }
    }


}
