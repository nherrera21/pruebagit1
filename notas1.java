package practica2;

import java.util.Scanner;

public class notas {

// Declaramos las variables necesarias para los cálculos
    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;

// Usamos Scanner para introducir datos desde la consola
    Scanner entrada = new Scanner(System.in);

    /**
     * Este método solicita la introducción de las notas de las UF por parte del
     * usuario.
     */
    public void IngresaNota() {
        System.out.println("Ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();
        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }

    /**
     * Este método comprueba que las notas introducidas estén en el rango
     * correcto.
     */
    public void comprobarcion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }
        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }
        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }

    /**
     * Este método calcula las notas acumuladas y la nota definitiva.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }

    /**
     * Este método muestra por pantalla las notas introducidas, las notas
     * acumuladas y la nota definitiva.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Este método comprueba si el estudiante ha aprobado o suspendido.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendido");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }

    /**
     * Este método principal permite llamar a los diferentes métodos de la clase
     * desde fuera de la misma.
     */
    public static void main(String[] args) {
// Creamos un objeto de la clase notas
        notas fc = new notas();

// Llamamos al método IngresaNotas() para que el usuario introduzca las notas
        fc.IngresaNotas();

// Llamamos al método comprobarcion() para comprobar que las notas introducidas son correctas
        fc.comprobarcion();

// Llamamos al método Calculonotas() para calcular la nota definitiva
        fc.Calculonotas();

// Llamamos al método Mostrar() para mostrar por pantalla las notas introducidas y la nota definitiva
        fc.Mostrar();

// Llamamos al método aprobado() para mostrar por pantalla si el estudiante ha aprobado o suspendido
        fc.aprobado();
    }
}
