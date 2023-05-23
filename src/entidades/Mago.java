/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class Mago extends Personaje {
    
    private int magia;
    private int sabiduria;
    
    public void lanzarHechizo(Personaje atacado)
    {
    
    }

    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 5);
        atacado.defender(this);
    }
    
    
}
