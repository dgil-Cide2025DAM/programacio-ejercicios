// nom: David Gil Rosa
// data: 25/09/2025
// DNI: 48782911A

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
       //***************************EJERCICIO IDENTIFICADORS*********************************** */ 
        
       int registro1;
      /*  int 1registro; MAL, porque comienza por un NUMERO. */
        int archivo_3;
        /* while (en.hasMoreElements()) {
            Object elem =  en.nextElement();
            
        } */ // El while esta bien individualmente, cuando es int while; falla ya que while es una funcion. Como el if, else if, etc.
      //  int $impuesto; CAracter especial $
        int año;
        /* char primer apelido;  MAL, ya que primer apellido va separado, no puede haber espacios, la correcion seria poner primer_apellido*/
        char primer_apellido;
        // char primer-apellido; MAL, ya que el guion es como si fuera un espacio (como en las variables de arriba "primer apellido")
        char primerApellido; // bien, formato camelCase
        // char Tom's; MAL, '' es un operador que marca texto, entonces Tom 's, le falta un operador, y ademas, una variable no puede tener eso, ya que seria declarada texto.
        int C3PO; 
        // int 123#;  caracter ilegal # , no puedes poner un sharp en la variable
        char PesoMaximo; 
     //  int %descuento; % esto no puede estar aqui, es como el #
        char Weight; 
         // double $$precioMinimo; CAracter especial $
        // int _$Único; mejor sin accentos, y sin la _ 
        // int tamaño_maximo;  mejor sin ñ
        // int peso.maximo; MAL, . entre dos palabras
        int Precio___; 
       // int matricula?; MAL, ? interrogante al final de la variable, no se lee y se compila mal
        int cuántoVale; // mejor sin accentos
        int high; 
        int barça; // mejor sin ç
        int piragüista; // mejor sin dieresis
        int B_011; 
        double X012AB;
        // int 70libro;MAL, numeros delante de la variable
       //  int nombre&apellido; caracter especial entre la variable
        // double 0X1A; numero delante de la variable
        // int else, MAL, es como el while, son funciones.
    /************************************EJERCICIO LITERALS******************************************** */
      double numero = 0.5;
      System.out.println(numero);
      double numero1 = .5;
      System.out.println(numero1); // Imprime el .5 como 0.5 ; no hay error de compilacion.
      double n2 = 9.3e12;
      System.out.println(n2); // e minuscula ha pasado a E mayuscula
      double n3 = 9.3e-12;
      System.out.println(n3); // ha pasado lo mismo que la anterior
      long n4 = 12345678;
      System.out.println(n4);
     // double n5 = 12345678_L; MAL, debido a que hay un underscore, Illegal char.
     // System.out.println(n5);
     //  int n5 = 0.8E+0.8; MAL. Suma entre dos valores, en un int. 
     // System.out.println(n5);
      double n6 = 0.8E8; // pasa de un 0.8E8 a un 8.0E7. Un poco raro no?
      System.out.println(n6);
      double n7 = 05_15; // pasé de int -> long - float hasta double, y fue alternando entre 333 y 333.0 ; en vez de dar 05_15
      System.out.println(n7);
     //  int n8 = 018CDF; CDF es un paquete, al parecer, es una libreria externa, o un paquete de libreria externa, por lo que salta error.
     //  System.out.println(n8);
      double n8 = 0XBC5DA; // sale un numero contrario a este valor, 771546.0
      System.out.println(n8);
      int n9 = 0x87e3a; // sale 556602
      System.out.println(n9);
      long n10 = 234567L; // omite la L, en la terminal.
      System.out.println(n10);
     //  double n11 = 0_B11; MAL; Underscore, guión bajo, es un signo ilegal.
      // System.out.println(n11);
      double n11 = 010101; // pasa de este valor a 4161.0
      System.out.println(n11);
     // byte n12 = 0_557; MAL, _ no se puede poner, salta error
     // System.out.println(n12);
     // double n12 = .00.8E2; "Syntax error on token ".8E2", delete this token" error de Java
      // System.out.println(n12);
      float n12 = .3e3f; // salta 300.0
      System.out.println(n12);
      short n13 = 0b111; // probé con el byte y el short, y sale 7 de valor
      System.out.println(n13);
      long n14 = 12_234L; // elimina caracteres que no entiende
      System.out.println(n14);
      int n15 = 0x1010B; // imprime resultados distintos
      System.out.println(n15);
      int n16 = 0Xabcd; // igual que el de arriba
      System.err.println(n16);
      long n17 = 0xabcEL;
      System.out.println(n17); // ha imprimido 43982, y el anterior 43981
     // int n18 = _234;
      // System.out.println(n18); // no ha imprimido nada, error de compilacion
      int n18 = 0x1010B; // imprime 65803
      System.out.println(n18);
      double n19 = 1_234.2E-2; // imprime 12.342
      System.out.println(n19); 
     // int n20 = 1234.2EF; error de compilacion, no reconoce el F
     // System.out.println(n20);
    //  int n20 = 1234.2E3F;  error de compilacion, no reconoce el F
     // System.out.println(n20);
     // double n20 = 1_1.2e_2; // error de compilacion, no reconoce el 2e_2
     // System.out.println(n20); 
     // int n20 = 0bABCDL; // error de compilacion, no reconoce el ABCDL
      // System.out.println(n20); 
      int n20 = 0X1A; //devuelve 26
      System.out.println(n20);
      double n21 = 0X12AL; // devuelve 298.0
      System.out.println(n21); 
   //   int n22 = abcd;
    //  System.out.println(n22); // error de compilacion, no reconoce abcd
      int n22 = 0125;
      System.out.println(n22); // devuelve 85
      double n23 = .01011;
      System.out.println(n23); 
      double n24 = 3e12; // devuelve 3.0E12
      System.out.println(n24);
      // double n25 = 3_e12; MAL, Operador ilegal _
      // System.out.println(n25); 
      double n26 = -3E-1_2; // devuelve -3.0E-12
      System.out.println(n26); 
     // int n27 = 0.8E;
      // System.out.println(n27); // error de compilacion, no reconoce 0.8E
    //  double n27 = 0B1212;
     // System.out.println(n27); // error de compilacion, no reconoce 0B1212
      int n28 = 1_2_3;
      System.out.println(n28); // devuelve 123
      int n29 = 0xedad;
      System.out.println(n29); // devuelve 60845
      int n30 = 0XBE2;
      System.out.println(n30); // devuelve 3042
      double n31 = 101e2;
      System.out.println(n31); // devuelve 10100.0
      // int n32 = B1101;
      // System.out.println(n32); // error de compilacion, no reconoce B1101
     // double n32 = 1.34.5;
      // System.out.println(n32); // error de compilacion, no reconoce .5
      float n32 = 12.3E4F;
      System.out.println(n32); // devuelve 123000.0
      // double n33 = 0X12AG; G error, no compila
      // System.out.println(n33); // error de compilacion, no reconoce G
    // ******************************************************************************************
        // ***********************EJERCICIO CHAR************************************
        char c1 = 'a';
        System.out.println(c1);
        // char c2 = '\ñ'; // MAL, no reconoce la ñ
        // System.out.println(c2);';
        // char c2 = "XYZ"; Char solamente reconoce un caracter, no una cadena
        // System.out.println(c2);
        // char c2 = +;
        // System.out.println(c2); // MAL, no reconoce +
        char c2 = '$';
        System.out.println(c2);
        //char c3 = "T"; "" esto es para string, no char
        // System.out.println(c3);
        char c4 = '4';
        System.out.println(c4);
        char c5 = '+';
        System.out.println(c5);
        char c6 = '\n';
        System.out.println(c6);
        char c7 = 'ñ';
        System.out.println(c7);
        char c8 = '\t';
        System.out.println(c8);
        char c9 = '?';
        System.out.println(c9);
       // char c10 = '/n'; // MAL, no reconoce /n
       //  System.out.println(c10);
        char c10 = '\\';
        System.out.println(c10);
        char c11 = '\u0066';
        System.out.println(c11);
       // char c12 = k;
       //  System.out.println(c12); // MAL, no reconoce k
        char c13 = ':';
        System.out.println(c13);
        /*************************EJERCICIOS STRINGS********************************** */
        // String s1 = '8:15 P.M.';  MAL, '' es para char, no para string
        // System.out.println(s1);
        String s1 = "Capitulo \'3\'";
        System.out.println(s1);
        String s2 = " "; 
        System.out.println(s2);
        String s3 = " programación ";
        System.out.println(s3); 
        // String s4 = 'W';
        // System.out.println(s4); // MAL, '' es para char, no para string
        String s4 = "Rojo, Blanco y Azul";
        System.out.println(s4);
        String s5 = "1.3e-1-2";
        System.out.println(s5);
        String s6 = "A";
        System.out.println(s6);
         //String s7 = "programacion "Java"";
        // System.out.println(s7); // MAL, no reconoce "Java" dentro de otro ""
        String s7 = "\n";
        System.out.println(s7);
        String s8 = "Nombre:";
        System.out.println(s8);
        // String s9 = """;
        // System.out.println(s9); // MAL, no reconoce """
        // String s9 = "FP'; // MAL, no reconoce ' dentro de ""
        // System.out.println(s9);
        // String s9 = programacion;
        // System.out.println(s9); // MAL, no reconoce programacion sin ""
        String s9 = "4 + 5 * 2";
        System.out.println(s9);

        /**********************EJERCICIO DECLARAR VARIABLES************************** */
    }
}