/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jaime
 */
public class Paciente extends Usuario {

    private LocalDate fechaNacimiento;
    private String genero;
    private HistorialMedico historialMedico;
    private List<Cita> citas;

    public Paciente( String nombre, String apellidos,String genero,
            String correo, String contraseña, String preguntaSeguridad, 
            String respuestaSeguridad) {
        super(nombre, apellidos, correo, contraseña,
                preguntaSeguridad, respuestaSeguridad);
        this.genero = genero;
    }

 


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public void agregarHistorial(String historial) {
        historialMedico.agregarHistorial(historial);
    }

 

}
