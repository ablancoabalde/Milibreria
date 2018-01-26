/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alberto.mostrar;

/**
 *
 * @author ablancoabalde
 */
public class Mostrar {

    public static void mostrarlnum(int[] lnum) {
        for (int listanum : lnum) {
            System.out.println(listanum);
        }
    }

    public static void mostrarlnum(float[] lnum) {
        for (float listanum : lnum) {
            System.out.println(listanum);
        }
    }

    public static void mostrarlString(String[] lnum) {
        for (String listanum : lnum) {
            System.out.println(listanum);
        }
    }

    public static void mostrarlObject(Object[] lnum) {
        for (Object listanum : lnum) {
            System.out.println(listanum);
        }
    }
}
