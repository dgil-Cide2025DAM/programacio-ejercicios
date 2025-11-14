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
    private int indiceAleatorio;
    private int indiceAleatorio1;
    private int indiceAleatorio2;
    private String[] insultos;
    private String[] respostes;
    private String[] insultosPropis = new String[3];
    private String[] respostesPropies = new String[3];
    private int indiceElegido;
    private String insultoElegido;

    // Constructor

    public Pirata(String nom, int vidaDeFuera, String[] insultosDeFuera, String[] respostesDeFuera) {
        this.nom = nom;
        viu = true;
        rd = new Random();
        this.vida = rd.nextInt(1, 4); // Vida Aleatoria 1 y 3

        this.insultos = insultosDeFuera;
        this.respostes = respostesDeFuera;

        // Tirar el dado, y coger respuesta/insulto aleatorio

        indiceAleatorio = rd.nextInt(insultosDeFuera.length);
        insultosPropis[0] = insultosDeFuera[indiceAleatorio];
        respostesPropies[0] = respostesDeFuera[indiceAleatorio];

        indiceAleatorio1 = rd.nextInt(insultosDeFuera.length);
        while (indiceAleatorio1 == indiceAleatorio) {
            indiceAleatorio1 = rd.nextInt(insultosDeFuera.length);
        }
        insultosPropis[1] = insultosDeFuera[indiceAleatorio1];
        respostesPropies[1] = respostesDeFuera[indiceAleatorio1];

        indiceAleatorio2 = rd.nextInt(insultosDeFuera.length);
        while (indiceAleatorio2 == indiceAleatorio || indiceAleatorio2 == indiceAleatorio1) {
            indiceAleatorio2 = rd.nextInt(insultosDeFuera.length);
        }
        insultosPropis[2] = insultosDeFuera[indiceAleatorio2];
        respostesPropies[2] = respostesDeFuera[indiceAleatorio2];

    }

    // Getter / Setter
    public String getNom() {
        return this.nom;
    }
    // Métodos

    public void insultar() {
        // Coger aleatorio del array de insultos propios.
        indiceElegido = rd.nextInt(insultosPropis.length);
        insultoElegido = insultosPropis[indiceElegido];
        System.out.println(insultoElegido);
    }

    public boolean replica(String respostaHeroi) {
        return respostesPropies[indiceElegido].equals(respostaHeroi);
    }

    public boolean vida() {
        this.vida--;
        if (this.vida == 0) { // si la vida es 0, jugador = muerto
            viu = false;
        }
        return viu;
    }
}
