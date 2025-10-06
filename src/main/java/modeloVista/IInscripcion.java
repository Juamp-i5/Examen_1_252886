/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

import DTOs.CursoDTO;
import DTOs.InscripcionDTO;
import java.util.List;

/**
 *
 * @author Jp
 */
public interface IInscripcion {

    void agregarCurso(int idCurso);

    void quitarCurso(int idCurso);

    double getCostoTotal();

    List<CursoDTO> getCursosInscritos();

    List<CursoDTO> getCursosDisponibles();

    InscripcionDTO getEstado();
    
    void notificarCambio();
}
