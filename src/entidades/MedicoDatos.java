/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class MedicoDatos {
    private List<Medico> medicos = new ArrayList<>();
    
    
    
    public MedicoDatos() {
        cargarDatosDeMedicos();
    }
     public Medico autenticarMedico(String correo, String contraseña) {
        for (Medico medico : medicos) {
            if (medico.getCorreo().equals(correo)
                    && medico.getContraseña().equals(contraseña)) {
                return medico;
            }
        }
        return null;
    }

    private void cargarDatosDeMedicos() {
        try {
            String archivoDoctores = "medicos.txt";

            Scanner scanner = new Scanner(new File(archivoDoctores));

            while (scanner.hasNextLine()) {
                String[] datosMedico = scanner.nextLine().split(",");
                if (datosMedico.length == 5) {
                    String nombre = datosMedico[0];
                    String apellidos = datosMedico[1];
                    String especialidad = datosMedico[2];
                    String correo = datosMedico[3];
                    String contraseña = datosMedico[4];
                    List<Cita> citasAtendidas = new ArrayList<>();
                    Medico medico = new Medico(nombre, apellidos,
                            especialidad, correo, contraseña,
                            citasAtendidas);
                    medicos.add(medico);
                }
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
