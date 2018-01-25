package com.alberto.array;

import com.alberto.nRandom.GNRamdom;
import javax.swing.JOptionPane;

/**
 *
 * @author ablancoabalde
 */
public class GeneradorArrays {

    public static int[] arrayintRandom(int tmlista, int valoRam1, int valoRam2) {
        int[] lnum=new int[tmlista];
        for (int i=0; i<lnum.length; i++) {
            lnum[i]=GNRamdom.solo1NRamdom(valoRam1, valoRam2);

        }
        return lnum;
    }

    public static Object resizeArray(Object oldArray, int newSize) {
        int oldSize=java.lang.reflect.Array.getLength(oldArray);
        Class elementType=oldArray.getClass().getComponentType();
        Object newArray=java.lang.reflect.Array.newInstance(
                elementType, newSize);
        int preserveLength=Math.min(oldSize, newSize);
        if (preserveLength>0) {
            System.arraycopy(oldArray, 0, newArray, 0, preserveLength);
        }
        return newArray;
    }

}
