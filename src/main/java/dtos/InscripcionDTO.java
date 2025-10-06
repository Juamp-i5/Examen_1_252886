/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOs;

import java.util.List;

/**
 *
 * @author Jp
 */
public class InscripcionDTO {

    private final List<CursoDTO> cursosDisponibles;
    private final List<CursoDTO> cursosInscritos;
    private final double costoTotal;

    public InscripcionDTO(List<CursoDTO> cursosDisponibles, List<CursoDTO> cursosInscritos, double costoTotal) {
        this.cursosDisponibles = List.copyOf(cursosDisponibles);
        this.cursosInscritos = List.copyOf(cursosInscritos);
        this.costoTotal = costoTotal;
    }

    public List<CursoDTO> getCursosDisponibles() {
        return cursosDisponibles;
    }

    public List<CursoDTO> getCursosInscritos() {
        return cursosInscritos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

}
