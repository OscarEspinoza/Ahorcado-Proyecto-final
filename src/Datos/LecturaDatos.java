/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anon
 */
public class LecturaDatos {

    public String datoleido[] = new String[2];

    public void lectura() throws IOException {
        try {
            File Archivo = new File("respuestas.txt");
            FileReader archivoleido = new FileReader(Archivo);
            BufferedReader archivolectura = new BufferedReader(archivoleido);
            for (int x = 0; x < 2; x++) {
                datoleido[x] = archivolectura.readLine();
            }
            archivoleido.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
