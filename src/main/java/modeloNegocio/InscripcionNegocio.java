/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocio;

import DTOs.InscripcionDTO;
import modeloVista.IInscripcion;

/**
 *
 * @author Jp
 */
public class InscripcionNegocio implements IInscripcionNegocio {

    private IInscripcion modeloVistaInscripcion;

    public InscripcionNegocio(IInscripcion modeloVistaInscripcion) {
        this.modeloVistaInscripcion = modeloVistaInscripcion;
    }

    @Override
    public void inscribirCurso(int idCurso) {
        modeloVistaInscripcion.agregarCurso(idCurso);
    }

    @Override
    public void quitarCurso(int idCurso) {
        modeloVistaInscripcion.quitarCurso(idCurso);
    }

    @Override
    public void finalizarInscripcion() {
        //AQUI SI LUEGO SE QUIERE HACER ALGO AL FINALIZAR LA INSCRIPCION SE HACE PERO SI NO QUIERES NO :p
    }

    @Override
    public InscripcionDTO getEstado() {
        return modeloVistaInscripcion.getEstado();
    }

}
