/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author jaime
 */
public class HistorialMedico {
    private List<String> historiales;

    public void agregarHistorial(String historial) {
        historiales.add(historial);
    }
}
