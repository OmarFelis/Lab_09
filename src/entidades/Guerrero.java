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
public class Guerrero extends Personaje {
    
    private int fuerza;
    private int resistencia;

    public void ataqueEspecial(Personaje atacado){
        //Implementar
    }
   
    @Override
    public void atacar(Personaje atacado) {
        int nivelActualDeVida = atacado.getVida();
        atacado.setVida(nivelActualDeVida - 10);
        atacado.defender(this);
    }
    
    
}
