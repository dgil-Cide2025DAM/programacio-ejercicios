package com.example;

public class Main {
    public static void main(String[] args) {
        String[] insultos = { "¿Has dejado ya de usar pañales?",
                "¿Conoces alguna isla desierta donde esconderte?", "Eres tan inutil, grumete!",
                "¿Por qué no te subes a un barril y te lanzas al mar?",
                "¿Acaso crees que puedes con un verdadero pirata?", "¿Te gustaría ser mi aprendiz de pirata?",
                "¿Por qué no te vas a buscar un tesoro en vez de molestarme?",
                "¿Acaso piensas que eres más listo que yo?",
                "¿Por qué no te largas de mi barco, inútil?"
        };

        String[] respostes = {
                "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "No, pero seguro que tú conoces alguna.",
                "Espero que ya hayas aprendido a tocarte la nariz.",
                "Buena idea, así me libraría de ti.",
                "Claro que no, pero al menos lo intento.",
                "No gracias, ya tengo suficiente con un aprendiz inútil como tú.",
                "Porque no eres más que un lastre para mi tripulación.",
                "No, pero tú pareces creerlo.",
                "Porque eres un estorbo en mi barco."
        };
        
        Heroi Heroi = new Heroi("Gumbruh", 10);
        System.out.println(Heroi.defensar());
    }
}