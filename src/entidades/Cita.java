/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;


public class Cita {
    private String paciente;
    private Date fecha;
    private Date hora;
    private String motivo;

    // Constructor
    public Cita(String paciente, Date fecha, Date hora, String motivo) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public Cita(String paciente, Date fecha, Date hora) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
    }
    

    public Cita(){}

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getTexto() {
        return this.paciente + " | " + this.fecha + " | " + this.hora;
    }
}

