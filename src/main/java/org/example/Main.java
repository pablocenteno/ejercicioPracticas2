package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DireccionConfig.class);

        Empleados empleado= context.getBean("jefe", Empleados.class);

        System.out.println(empleado.getDireccion());
        System.out.println(empleado.getEdad());
        System.out.println(empleado.getNacionalidad());
    }
}