// Responsabilidad: administrar un conjunto de piratas.
// Una isla está compuesta por piratas.

package com.example;
import java.util.Random;

public class Illa {
    // Atributos
    String nom;
    String[] piratas;

    Random rd = new Random();

    // Constructor
    public Illa(String nom) {
        this.nom = "Cuba";
    }
    public Illa(String[] piratas) {
        this.piratas = new String[]{ "LeChuck", "Largo LaGrande", "Capitán Dread", "Otis", "Meathook", "Griswold Sopabuena", "Stan S. Stanman"};
    }

    // Getter / Setter




    // Métodos
    public String pirataAleatorio() {
        int index = rd.nextInt(3, 8); // Genera un número aleatorio entre 3 y 7
        return piratas[index];
    }
   // public String vullUnPirata(int index) {
         // return piratas[index];
    
}
// El mètode constructor de l’illa generarà i guardarà els pirates dins l’illa.


// La classe haurà de tenir un mètode vullUnPirata(index) que farà que el nostre heroi s’enfronti, un per un, a tots els pirates de l’illa. El métode vullUnPirata ha de retornar un objecte de tipus pirata. 