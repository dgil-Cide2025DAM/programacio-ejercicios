package com.example;

public class Main {
    public static void main(String[] args) {
        String[] insultos = { 
                "Ugh.. Hoy con brazo poderoso a doce hombres he vencido.",
                "Tengo músculos en lugares que no conoces ni de nombre.",
                "Ríndete ahora o te aplastaré como a un tomate.",
                "Aargh.. Mi fuerza asombrosa te romperá el cúbito en mil pedazos.",
                "Aaarg... Eh!. ¡Mira allí!.", 
                "¡A pulpos he vencido con estos fuertes brazos!.",
                "Veo que en tu boca asoma una mueca de agonía.",
                "Arrrgh... Mi bisabuela de 98 años tiene mejores biceps que tu.",
                "Uuggh... ¡Eres el bicho mas feo que en mi vida haya encontrado!..."
        };

        String[] respostes = {
                "Grrr... Al ver el tamaño de tu barriga, diríase que te los has comido.",
                "Aarrgh... Lástima que no tengas ninguno en los brazos.",
                "Me rendiría si eso me evitara tener que mirarte.",
                "Grrrr... No me imaginaba que supieras contar hasta tan alto.",
                "Uugh.. Si, si, ya se. Es un mono de tres cabezas.",
                "Tu poder sin duda doblega a todo invertebrado.",
                "Es que tu toquecito me hace reír de cosquillas.",
                "Ugh... si pero tanto ella como yo tenemos mejor control de la vejiga que tú.",
                "Me asombra que nunca a tu mujer hayas mirado."
        };
        System.out.println("\nDeep in the Caribbean\n");
        System.out.println();
        System.out.println("----------------------- ╬ MONKEY ISLAND ╬ --------------------");
        System.out.println();
        System.out.println("\n\n Ø ¡Bienvenido Aventurero! Ø\n\n ¤ El juego consiste en sobrevivir a los insultos de los piratas. \n Responde correctamente para ganar puntos y avanzar de ronda. \n Pero cuidado, si fallas perderás vidas. ¤ \n\n £ Si te quedas sin vidas, solo te esperará la muerte, piratilla! £ ");

        Heroi heroi = new Heroi("Gumbruh", 10);
        Illa isla = new Illa("Cuba", insultos, respostes);

        System.out.println("\n\nBienvenido a la isla de los Piratas: " + isla.getNom() + "");

        System.out.println("\n\nLucharás contra: " + isla.getNumeroPiratas() + " piratas.\n" + "\nCada uno tendra entre 1 y 3 vidas." + "\nGanas al derrotar todos los piratas de la isla!" + "\n\n▓Buena suerte, piratilla! ▓");

        System.out.println("Tu nombre es: " + heroi.getNom() + "\n");

        







        Pirata prueba = new Pirata("Guy", 3, insultos, respostes);
        prueba.insultar();

        String respostaHeroi = heroi.defensar();

        System.out.println(prueba.replica(respostaHeroi));
    }
}
/*
 * Es crea un objecte Heroi i un objecte Illa.
 * 
 * 
 * L’illa genera aleatòriament un conjunt de pirates.
 * 
 * 
 * El nostre heroi s’enfronta, un per un, a tots els pirates de l’illa.
 * 
 * 
 * En cada combat, els dos personatges fan la batalla d’insults.
 * El pirata insulta.
 * L’heroi (usuari) contesta.
 * Si l’heroi encerta la resposta, el pirata perd vida. Si l’heroi falla,
 * l’heroi perd vida.
 * Guanya la batalla el que queda amb vida.
 * 
 * 
 * Si el Heroe arriba al final de l’Illa, guanya. Si mor antes, perd.
 * 
 */