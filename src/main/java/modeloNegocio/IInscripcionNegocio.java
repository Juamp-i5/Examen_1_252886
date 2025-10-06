/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modeloNegocio;

import DTOs.InscripcionDTO;

/**
 *
 * @author Jp
 */
public interface IInscripcionNegocio {

    void inscribirCurso(int idCurso);

    void quitarCurso(int idCurso);

    void finalizarInscripcion();

    InscripcionDTO getEstado();
}
