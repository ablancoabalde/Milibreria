/*
 * Clase que genera números alazar
 */
package com.alberto.nRandom;

import java.util.Random;

/**
 *
 * @author ablancoabalde
 */
public class GNRamdom {

    public static int solo1NRamdom(int numI, int numF) {
// Producir nuevo int aleatorio entre 1 y 50
         int numeroAleatorio = (int) (Math.random()*(numF+numI));


        return numeroAleatorio;

    }

}
