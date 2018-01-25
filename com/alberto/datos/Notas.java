package com.alberto.datos;

public class Notas {

    public static String AproboNo(int[] lnotas) {
        int aprobados=0, suspensos=0;

        for (int i=0; i<lnotas.length; i++) {
            if (lnotas[i]>5) {
                aprobados+=1;
            } else {
                suspensos+=1;
            }
        }
        return "Número de aprobados "+aprobados+" número de suspensos "+suspensos;
    }

    public static int Notamedia(int[] lnotas) {
        int sumaNotas=0;
        for (int i=0; i<lnotas.length; i++) {
            sumaNotas+=lnotas[i];
        }
        return (sumaNotas/lnotas.length);
    }

    public static float media(float[] larray) {
        float sumaNotas=0;
        for (int i=0; i<larray.length; i++) {
            sumaNotas+=larray[i];
        }
        return (sumaNotas/larray.length);
    }

    public static int NotaMasAlta(int[] lnotas) {
        int nota=0;
        for (int i=0; i<lnotas.length; i++) {
            if (nota<lnotas[i]) {
                nota=lnotas[i];
            }
        }

        return nota;
    }

    public static int masAltas(float[] larray, float media) {
        int aMasaltos=0;
        for (int i=0; i<larray.length; i++) {
            if (larray[i]>media) {
                aMasaltos+=1;
            }
        }

        return aMasaltos;
    }

    public static int masBajas(float[] larray, float media) {
        int aMasbajos=0;
        for (int i=0; i<larray.length; i++) {
            if (larray[i]<media) {
                aMasbajos+=1;
            }
        }
        //Calculo de porcentaje
       

        return  (aMasbajos*100)/larray.length;
    }

}
