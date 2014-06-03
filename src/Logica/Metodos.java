/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.LecturaDatos;
import Logica.Metodos;

import java.io.*;

/**
 *
 * @author anon
 */
public class Metodos {

    LecturaDatos le = new LecturaDatos();
    public String comparado[] = new String[6];

    public void rtausuario(String capt[]) throws IOException {
        le.lectura();
        for (int x = 0; x < 6; x++) {
            if (capt[x].equals(String.valueOf(le.datoleido[1].charAt(x)))) {
                comparado[x]=String.valueOf(le.datoleido[1].charAt(x));
            } else {
                comparado[x]="";
            }

        }
    }
}
