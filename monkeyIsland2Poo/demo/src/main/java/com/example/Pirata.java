package com.example;

// La lógica de combate del pirata, está dentro del pirata.
// Sólo actúa durante un combate. No sabe nada de las otras clases.

import java.util.Random;

public class Pirata {

    /*
     * Array cuadruple: dos grandes categorías: insultos y respuestas
     * dos arrays pequeños que contienen 3 insultos propios exclusivos de un pirata
     * otro array pequeño que contiene las respuestas a esos insultos
     */

    // Atributos
    private String nom;
    private int vida; // aleatorio entre 1 y 3
    Random rd;
    private boolean viu;
    private int resultadoDeFueraGuardado;
    private String[] insultos;
    private String[] respostes;
    private String[] insultosPropis;
    private String[] respostesPropies;

    // Constructor

    public Pirata(String nom, int vidaDeFuera, String[] insultosDeFuera, String[] respostesDeFuera) {
        this.nom = nom;
        this.vida = vidaDeFuera;
        viu = true;
        rd = new Random();
        this.insultos = insultosDeFuera;
        this.respostes = respostesDeFuera;
        resultadoDeFueraGuardado = rd.nextInt(insultosDeFuera.length);
        insultosPropis[0] = insultosDeFuera[resultadoDeFueraGuardado];
        
        
    }

    // Getter / Setter

    // Métodos
    

    public boolean vida() {
        vida--;
        if (this.vida == 0) { // si la vida es 0, jugador = muerto
            viu = false;
        }
        return viu;
    }
}
