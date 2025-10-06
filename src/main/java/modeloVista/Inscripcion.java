/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

import DTOs.CursoDTO;
import DTOs.InscripcionDTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import observer.Subject;

/**
 *
 * @author Jp
 */
public class Inscripcion extends Subject implements IInscripcion {

    private final Set<CursoDTO> cursosDisponibles;
    private final Set<CursoDTO> cursosInscritos = new HashSet<>();

    public Inscripcion(List<CursoDTO> cursosIniciales) {
        this.cursosDisponibles = new HashSet<>(cursosIniciales);
    }

    @Override
    public void agregarCurso(int idCurso) {
        for (CursoDTO curso : cursosDisponibles) {
            if (curso.getId() == idCurso) {
                cursosDisponibles.remove(curso);
                cursosInscritos.add(curso);
                notificarObservers(getEstado());
                break;
            }
        }
    }

    @Override
    public void quitarCurso(int idCurso) {
        for (CursoDTO curso : cursosInscritos) {
            if (curso.getId() == idCurso) {
                cursosInscritos.remove(curso);
                cursosDisponibles.add(curso);
                notificarObservers(getEstado());
                break;
            }
        }
    }

    @Override
    public double getCostoTotal() {
        return cursosInscritos.stream().mapToDouble(c -> c.getCosto()).sum();
    }

    @Override
    public List<CursoDTO> getCursosInscritos() {
        return new ArrayList<>(cursosInscritos);
    }

    @Override
    public List<CursoDTO> getCursosDisponibles() {
        return new ArrayList<>(cursosDisponibles);
    }

    @Override
    public InscripcionDTO getEstado() {
        return new InscripcionDTO(
                new ArrayList(cursosDisponibles),
                new ArrayList(cursosInscritos),
                getCostoTotal()
        );
    }

    @Override
    public void notificarCambio() {
        notificarObservers(getEstado());
    }

}
