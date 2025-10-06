/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JFrame;
import modeloNegocio.IInscripcionNegocio;
import vista.DialogoFichaPago;

/**
 *
 * @author Jp
 */
public class ControladorInscripcion implements IControladorInscripcion {

    private IInscripcionNegocio negocio;
    private JFrame vistaPrincipal;

    public ControladorInscripcion(IInscripcionNegocio negocio, JFrame vistaPrincipal) {
        this.negocio = negocio;
        this.vistaPrincipal = vistaPrincipal;
    }

    @Override
    public void inscribirCurso(int idCurso) {
        negocio.inscribirCurso(idCurso);
    }

    @Override
    public void quitarCurso(int idCurso) {
        negocio.quitarCurso(idCurso);
    }

    @Override
    public void finalizarInscripcion() {
        negocio.finalizarInscripcion();
        DialogoFichaPago fichaPago = new DialogoFichaPago(vistaPrincipal, true, negocio.getEstado());
        fichaPago.setVisible(true);
        fichaPago.setLocationRelativeTo(null);
    }

}
