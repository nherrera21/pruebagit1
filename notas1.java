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