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
public class Medico extends Usuario {

    private String especialidad;
    private List<Cita> citasAtendidas;
    private List<Medico> medicos = new ArrayList<>();

    public Medico(String nombre, String apellidos, String especialidad,
            String correo, String contraseña, List<Cita> citasAtendidas) {
        super(nombre, apellidos, correo, contraseña);
        this.especialidad = especialidad;
        this.citasAtendidas = citasAtendidas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Cita> getCitasAtendidas() {
        return citasAtendidas;
    }

    public void setCitasAtendidas(List<Cita> citasAtendidas) {
        this.citasAtendidas = citasAtendidas;
    }

    public void atenderCita(Cita cita) {
        citasAtendidas.add(cita);
    }

}
