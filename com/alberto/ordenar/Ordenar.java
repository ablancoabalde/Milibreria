package com.alberto.ordenar;

public class Ordenar {

    public static void ordenar(float[] temp) {
        float aux;
        for (int i=0; i<temp.length-1; i++) {
            for (int j=i+1; j<temp.length; j++) {
                if (temp[i]>temp[j]) {
                    aux=temp[i];
                    temp[i]=temp[j];
                    temp[j]=aux;
                }
            }
        }
    }
    public static void ordenar(int[] temp) {
        int aux;
        for (int i=0; i<temp.length-1; i++) {
            for (int j=i+1; j<temp.length; j++) {
                if (temp[i]>temp[j]) {
                    aux=temp[i];
                    temp[i]=temp[j];
                    temp[j]=aux;
                }
            }
        }
    }

    public static void ordenarReverse(float[] temp) {
        float aux;
        for (int i=0; i<temp.length-1; i++) {
            for (int j=i+1; j<temp.length; j++) {
                if (temp[i]<temp[j]) {
                    aux=temp[i];
                    temp[i]=temp[j];
                    temp[j]=aux;
                }
            }
        }
    }
    
        public static void ordenarReverse(int[] temp) {
        int aux;
        for (int i=0; i<temp.length-1; i++) {
            for (int j=i+1; j<temp.length; j++) {
                if (temp[i]<temp[j]) {
                    aux=temp[i];
                    temp[i]=temp[j];
                    temp[j]=aux;
                }
            }
        }
    }
}
