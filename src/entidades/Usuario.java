/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jaime
 */
public class Usuario extends Persona {

    private String correo;
    private String contraseña;
    private String preguntaSeguridad;
    private String respuestaSeguridad;

    public Usuario(String nombre, String apellidos,
            String correo, String contraseña ) {
        super(nombre, apellidos);
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario(String nombre, String apellidos,
            String correo, String contraseña, String preguntaSeguridad,
            String respuestaSeguridad) {
        super(nombre, apellidos);
        this.correo = correo;
        this.contraseña = contraseña;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuestaSeguridad = respuestaSeguridad;
    }

    public Usuario() {
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(String preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuestaSeguridad() {
        return respuestaSeguridad;
    }

    public void setRespuestaSeguridad(String respuestaSeguridad) {
        this.respuestaSeguridad = respuestaSeguridad;
    }

}
