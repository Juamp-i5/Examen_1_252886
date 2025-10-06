/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jp
 */
public abstract class Subject {

    private final Set<IObserver> observers = new HashSet<>();

    public void registrarObserver(IObserver observer) {
        observers.add(observer);
    }

    public void removerObserver(IObserver observer) {
        observers.remove(observer);
    }

    public void notificarObservers(Object estado) {
        for (IObserver observer : observers) {
            observer.actualizar(estado);
        }
    }
}
