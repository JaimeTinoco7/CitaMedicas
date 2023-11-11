/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author jaime
 */
public class Cita {
    
    private int id;
    private Date fechaHora;
    private InformeMedico informeMedico;
    private String estado;
    private Paciente paciente;
    private Medico medico;

    public Cita(Paciente paciente, Medico medico, Date fechaHora) {
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
    }


    
    

    public Cita(int id, Date fechaHora, InformeMedico informeMedico, 
            Paciente paciente, Medico medico) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.informeMedico = informeMedico;
        this.paciente = paciente;
        this.medico = medico;
        estado = "Programado";
        
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public InformeMedico getInformeMedico() {
        return informeMedico;
    }

    public void setInformeMedico(InformeMedico informeMedico) {
        this.informeMedico = informeMedico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
}
