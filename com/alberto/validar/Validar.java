package com.alberto.validar;

import javax.swing.JOptionPane;

public class Validar {

    //Validación de Nota, cuando el valor este comprendido entre 1 y 10
    public static int validarNota() {
        int nota;
        do {

            nota=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la nota"));

        } while (nota<1||nota>10);
        return nota;
    }
}
