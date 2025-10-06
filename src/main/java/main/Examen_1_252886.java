/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main;

import controlador.ControladorInscripcion;
import controlador.IControladorInscripcion;
import java.util.ArrayList;
import java.util.List;
import modeloNegocio.IInscripcionNegocio;
import modeloNegocio.InscripcionNegocio;
import DTOs.CursoDTO;
import modeloVista.IInscripcion;
import modeloVista.Inscripcion;
import observer.Subject;
import vista.VentanaPrincipal;

/**
 *
 * @author Jp
 */
public class Examen_1_252886 {
    
    public static void main(String[] args) {
        List<CursoDTO> cursosIniciales = new ArrayList<>();
        cursosIniciales.add(new CursoDTO(1, "Programación Orientada a Objetos", 1500));
        cursosIniciales.add(new CursoDTO(2, "Bases de Datos", 1800));
        cursosIniciales.add(new CursoDTO(3, "Desarrollo Web Full Stack", 2500));
        cursosIniciales.add(new CursoDTO(4, "Inteligencia Artificial", 3000));
        
        IInscripcion modelo = new Inscripcion(cursosIniciales);
        IInscripcionNegocio negocio = new InscripcionNegocio(modelo);
        VentanaPrincipal vista = new VentanaPrincipal();
        IControladorInscripcion controlador = new ControladorInscripcion(negocio, vista);
        
        vista.setControlador(controlador);
        ((Subject) modelo).registrarObserver(vista);
        
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        modelo.notificarCambio();
    }
}
