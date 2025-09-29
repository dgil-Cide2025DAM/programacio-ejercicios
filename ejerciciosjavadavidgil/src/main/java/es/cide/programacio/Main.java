// nom: David Gil Rosa
// data: 25/09/2025
// DNI: 48782911A

package es.cide.programacio;

public class Main {
  public static void main(String[] args) {
    // ***************************EJERCICIO
    // IDENTIFICADORS*********************************** */

    int registro1;
    /* int 1registro; MAL, porque comienza por un NUMERO. */
    int archivo_3;
    /*
     * while (en.hasMoreElements()) {
     * Object elem = en.nextElement();
     * 
     * }
     */ // El while esta bien individualmente, cuando es int while; falla ya que while
        // es una funcion. Como el if, else if, etc.
    // int $impuesto; CAracter especial $
    int año;
    /*
     * char primer apelido; MAL, ya que primer apellido va separado, no puede haber
     * espacios, la correcion seria poner primer_apellido
     */
    char primer_apellido;
    // char primer-apellido; MAL, ya que el guion es como si fuera un espacio (como
    // en las variables de arriba "primer apellido")
    char primerApellido; // bien, formato camelCase
    // char Tom's; MAL, '' es un operador que marca texto, entonces Tom 's, le falta
    // un operador, y ademas, una variable no puede tener eso, ya que seria
    // declarada texto.
    int C3PO;
    // int 123#; caracter ilegal # , no puedes poner un sharp en la variable
    char PesoMaximo;
    // int %descuento; % esto no puede estar aqui, es como el #
    char Weight;
    // double $$precioMinimo; CAracter especial $
    // int _$Único; mejor sin accentos, y sin la _
    // int tamaño_maximo; mejor sin ñ
    // int peso.maximo; MAL, . entre dos palabras
    int Precio___;
    // int matricula?; MAL, ? interrogante al final de la variable, no se lee y se
    // compila mal
    int cuántoVale; // mejor sin accentos
    int high;
    int barça; // mejor sin ç
    int piragüista; // mejor sin dieresis
    int B_011;
    double X012AB;
    // int 70libro;MAL, numeros delante de la variable
    // int nombre&apellido; caracter especial entre la variable
    // double 0X1A; numero delante de la variable
    // int else, MAL, es como el while, son funciones.
    /************************************
     * EJERCICIO LITERALS********************************************
     */
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
    // int n5 = 0.8E+0.8; MAL. Suma entre dos valores, en un int.
    // System.out.println(n5);
    double n6 = 0.8E8; // pasa de un 0.8E8 a un 8.0E7. Un poco raro no?
    System.out.println(n6);
    double n7 = 05_15; // pasé de int -> long - float hasta double, y fue alternando entre 333 y 333.0
                       // ; en vez de dar 05_15
    System.out.println(n7);
    // int n8 = 018CDF; CDF es un paquete, al parecer, es una libreria externa, o un
    // paquete de libreria externa, por lo que salta error.
    // System.out.println(n8);
    double n8 = 0XBC5DA; // sale un numero contrario a este valor, 771546.0
    System.out.println(n8);
    int n9 = 0x87e3a; // sale 556602
    System.out.println(n9);
    long n10 = 234567L; // omite la L, en la terminal.
    System.out.println(n10);
    // double n11 = 0_B11; MAL; Underscore, guión bajo, es un signo ilegal.
    // System.out.println(n11);
    double n11 = 010101; // pasa de este valor a 4161.0
    System.out.println(n11);
    // byte n12 = 0_557; MAL, _ no se puede poner, salta error
    // System.out.println(n12);
    // double n12 = .00.8E2; "Syntax error on token ".8E2", delete this token" error
    // de Java
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
    // int n20 = 1234.2E3F; error de compilacion, no reconoce el F
    // System.out.println(n20);
    // double n20 = 1_1.2e_2; // error de compilacion, no reconoce el 2e_2
    // System.out.println(n20);
    // int n20 = 0bABCDL; // error de compilacion, no reconoce el ABCDL
    // System.out.println(n20);
    int n20 = 0X1A; // devuelve 26
    System.out.println(n20);
    double n21 = 0X12AL; // devuelve 298.0
    System.out.println(n21);
    // int n22 = abcd;
    // System.out.println(n22); // error de compilacion, no reconoce abcd
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
    // double n27 = 0B1212;
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
    // char c3 = "T"; "" esto es para string, no char
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
    // System.out.println(c10);
    char c10 = '\\';
    System.out.println(c10);
    char c11 = '\u0066';
    System.out.println(c11);
    // char c12 = k;
    // System.out.println(c12); // MAL, no reconoce k
    char c13 = ':';
    System.out.println(c13);
    /*************************
     * EJERCICIOS STRINGS**********************************
     */
    // String s1 = '8:15 P.M.'; MAL, '' es para char, no para string
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
    // String s7 = "programacion "Java"";
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

    /**********************
     * EJERCICIO DECLARAR VARIABLES**************************
     */
    int p, q;
    p = 8;
    q = 15;
    System.out.println(p);
    System.out.println(q);
    // char a, b, c;
    // a = 'X';
    // b = 'Y'; En la diapositiva 11 necesito estas variables
    // c = 'Z';
    // System.out.println(a);
    // System.out.println(b);
    // System.out.println(c);
    long contador = 102930;
    System.out.println(contador);
    int indice = 123;
    System.out.println(indice);
    char car1, car2;
    car1 = 'A';
    car2 = 'B';
    System.out.println(car1);
    System.out.println(car2);
    boolean primero, ultimo;
    primero = true;
    ultimo = false;
    System.out.println(primero);
    System.out.println(ultimo);
    /*
     * float x, y, z;
     * x = 1.5f;
     * y = 2.5f;
     * z = 3.5f;
     * System.out.println(x);
     * System.out.println(y);
     * System.out.println(z);
     */ // las variables x,y,z ya las uso en la diapositiva 12
    double raiz1, raiz2;
    raiz1 = 1.732;
    raiz2 = 3.1416;
    System.out.println(raiz1);
    System.out.println(raiz2);
    short indicador;
    indicador = 125;
    System.out.println(indicador);
    double precio, precioFinal;
    precio = 19.95;
    precioFinal = 24.95;
    System.out.println(precio);
    System.out.println(precioFinal);
    byte valor;
    valor = 127;
    System.out.println(valor);
    String nombre;
    nombre = "David";
    System.out.println(nombre);

    /**********************
     * DECLARAR VARIABLES (Diapositiva 8)**************************************
     */
    byte edad;
    edad = 25;
    System.out.println(edad);
    short altura;
    altura = 175;
    System.out.println(altura);
    boolean mujer;
    mujer = false;
    System.out.println(mujer);
    String nombre1; // debido a que se duplica la variable, le puse un 1
    nombre1 = "David1";
    System.out.println(nombre1);
    double iva = 0.18;
    System.out.println(iva);
    byte peso = 70;
    System.out.println(peso);
    boolean alumnoRepetidor;
    alumnoRepetidor = true;
    alumnoRepetidor = false;
    System.out.println(alumnoRepetidor);
    String letra;
    letra = "Z";
    System.out.println(letra);
    short minutos = 60;
    System.out.println(minutos);
    String matriculaCoche = "0882ABC";
    System.out.println(matriculaCoche);
    Boolean mayorDeEdad;
    mayorDeEdad = true;
    mayorDeEdad = false;
    System.out.println(mayorDeEdad);
    double códigoPostal = 07011; // mejor sin acento
    System.out.println(códigoPostal);
    boolean genero;
    genero = false; // true hombre, false mujer
    genero = true;
    System.out.println(genero);
    byte numeroDeHijos = 0;
    System.out.println(numeroDeHijos);
    int tallaCamisa = 40;
    System.out.println(tallaCamisa);
    // double precio1 = 20$;
    // System.out.println(precio1); // MAL, no reconoce el $ en la variable
    String mensaje = "Hola a todos";
    System.out.println(mensaje);
    short mayorEdad = 18;
    System.out.println(mayorEdad);
    short dias = 365;
    System.out.println(dias);
    byte contador1 = 0; // añado un 1 para no duplicar la variable
    System.out.println(contador1);
    char tallaCamiseta;
    tallaCamiseta = 'S';
    tallaCamiseta = 'M';
    tallaCamiseta = 'L';
    tallaCamiseta = 'X';
    System.out.println(tallaCamiseta);
    /***********************
     * EXPRESIONES ALGEBRAICAS A ALGORITMICAS***********************************
     */
    // int resultado = (b/2-4*a*c); no pueden resolver la variable
    // System.out.println(resultado);
    /*
     * double resultado1 = (3*x*y-5*x+12*x-17);
     * System.out.println(resultado1);
     * // int resultado2 = ((b+d)/(c+4)); // al parecer la d no puede ser una
     * variable "d cannot be resolved to a variableJava(33554515)"
     * // System.out.println(resultado2);
     * double resultado2 = (x*y/y + 2);
     * System.out.println(resultado2);
     * double resultado3 = (1/y+3*x/z+1);
     * System.out.println(resultado3);
     * // double resultado4 = (1/(y+3) + x/y+); // le falta un valor(+) al final
     * para que se complete la operacion
     * // System.out.println(resultado4);
     * double resultado4 = (1/y+3+x/y+1); // x y z las tengo en la diapositiva 12
     * // System.out.println(resultado4);
     * 
     * /*******************EXPRESIONES ALGEBRAICAS A ALGORITMICAS(diapositiva
     * 10)***********************************
     */
     /* int x = 2, y = 3, z = 4, g = 5, h = 6, j = 7, p = 8, q = 9, e = 10, f = 11, m = 12, n = 13;
    double res1 = (3 / 2 + 4 / 3);
    System.out.println(res1);
    // double res2 = (1/x-5-3*x*y/4); x y z las tengo en la diapositiva 12
    // System.out.println(res2);
    double res3 = (1 / 2 + 7);
    System.out.println(res3);
    double res4 = (7 + 1 / 2);
    System.out.println(res4);
    double res5 = (Math.pow(a, 2)/b-c+d-e/f-(g*h)/j); MAL, no acepta a todas las
    letras como variables; aademas puse Math.pow(a, 2 ) en vez de a^2 para elevar
    a 2
    System.out.println(res5);
    float res5 = (m/n+p); No reconoce m,n ; ademas puse float en vez de double
    para probar si funcionaba
    System.out.println(res5);
    double res5 = (m+n/p-q); // No reconoce m,n ; pone que no pueden ser
    variables "m cannot be resolved to a variableJava(33554515)"
    System.out.println(res5);
    double res5 = (Math.pow(a, 2)/(Math.pow(b, 2)+(Math.pow(c, 2)/(Math.pow(d,
    2)))));
    System.out.println(res5); Sigue sin reconocer d como variable. No entiendo el
    porque.
    double res5 = (m+n/p/q-r/s); // No reconoce m,n, ni r y s ; pone que no
    pueden ser variables "m cannot be resolved to a variableJava(33554515)"
    System.out.println(res5);
    double res5 = ((3*a+b)/(c-(d+5*e)/f+(g/2*h))); // No reconoce ninguna
    variable a partir de la d. Esta fue una operacion dificil de poner al tener
    tantos niveles de estructura.
    System.out.println(res5);
    double res5 = (Math.pow(a, 2)+2*a*b+Math.pow(b, 2)/(1/Math.pow(x, 2))+2);
    System.out.println(res5);  */ //no pueden resolver las variables, debido a que no
     // se han iniciliazado antes... (me di cuenta mientras hacia la diapositiva 11)

    /***********************
     * Diapositiva 11: Calculos aritmeticos********************
     */ /* 
    char a = 8;
    char b = 3;
    int c = -5;
    int suma = a + b + c; // 6
    int division = a / b; // 2
    int division2 = a / c; // -1
    int multiplicacion = a * b / c; // -4
    int multiplicacion2 = (a * c) % b; // -1
    int m1 = (3 * a - 2 * b) % (2 * a - c); // 18
    int m2 = (a - 3 * b) % (c + 2 * a) / (a - c); // 0
    int m3 = (2 * b + 3 * (a - c)); // 45
    int m4 = (a % b); //2
    int m5 = (a % c); // 3
    int m6 = (a * (b / c)); // 0
    int m7 = (a * c % b); // -1
    int m8 = (2 * (a / 5 + (4 - b * 3)) % (a + c - 2)); // 0
    int m9 = (a - b - c * 2); // 15
    System.out.println(suma);
    System.out.println(division);
    System.out.println(division2);
    System.out.println(multiplicacion);
    System.out.println(multiplicacion2);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);
    System.out.println(m5);
    System.out.println(m6);
    System.out.println(m7);
    System.out.println(m8);
    System.out.println(m9); */
    /***************** Diapositiva 12********************************** */
    /* 
    double x, y, z;
    x = 88;
    y = 3.5;
    z = -5.2;
    double r1 = (x + y + z); // 86.3
    double r2 = (x / y); // 25.1428
    double r3 = (x / (y + z)); // -51.7647
    double r4 = (2 * x / 3 * y);// 205.3333
    double r5 = (x * y % z); // 1.1999
    double r6 = (3 * x - z - 2 * x); // 93.1999
    double r7 = (x - 100 % y % z); // 86.0
    double r8 = (2 * y + 3 * (x - z)); // 286.6
    double r9 = (x % y); // 0.5
    double r10 = ((x / y) + z); // 19.9428
    double r11 = 2 * x / (3 * y); // 16.7619
    double r12 = x * (y % z); // 308.0
    double r13 = 2 * x / 5 % y; // 0.2000
    double r14 = x - y - z * 2; // 94.9
    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
    System.out.println(r4);
    System.out.println(r5);
    System.out.println(r6);
    System.out.println(r7);
    System.out.println(r8);
    System.out.println(r9);
    System.out.println(r10);
    System.out.println(r11);
    System.out.println(r12);
    System.out.println(r13);
    System.out.println(r14); 
    */

    /***************** Diapositiva 13********************************** */
    byte b;
    short s;
    long ln;
    int i, j;
    float f;
    double d;
    char c;
    b = 5;
    s = 10;
    i = 15;
    j = 20;
    ln = 25;
    f = 30.0f;
    d = 35.0;
    c = '3'; 
    double resA = i + c; // int
    double resB = f - c; // float - char = float
    double resC = d + f; // double + float = double
    double resD = d + i; // double + int = double
    double resE = i / f;
    double resF = s + j;
    double resG = d + j;
    double resH = s * c;
    double resI = d+c;
    double resJ = b+c;
    double resK = b / c+s;
    double resL = c + c;
    double resM = i + ln +d;
    double resN = ln + c;
    double resO = 5 / j;
    double resP = 5.2 / j;
    double resQ = i * f * 2.5;
//    double resR = ln *f*2.5F; Los caracteres no pueden estar en operaciones
  //  double resS = j - 4L;
   // double resT = j - 4L * 2.5F;
    // double resU = b + 2.5 * i + 35F;
   // double resV = 'a' + b;
   // double resW = 'a' + c;
    double resX = c + 2;
    double resY = c - ln / 2;
    double resZ = 2 / i + 2.0 / j;
    System.out.println(resA); // int + char = int ( creo que es por el orden de la operacion)
    System.out.println(resB);
    System.out.println(resC);
    System.out.println(resD);
    System.out.println(resE);
    System.out.println(resF);
    System.out.println(resG);
    System.out.println(resH);
    System.out.println(resI);
    System.out.println(resJ);
    System.out.println(resK);
    System.out.println(resL);
    System.out.println(resM);
    System.out.println(resN);
    System.out.println(resO);
    System.out.println(resP);
    System.out.println(resQ);
   // System.out.println(resR);
   // System.out.println(resS);
   // System.out.println(resT);
   // System.out.println(resU);
  //  System.out.println(resV); /*  char + byte = int ( creo que es por el
   // orden de la operacion) */
   // System.out.println(resW);
    System.out.println(resX);
    System.out.println(resY);
    System.out.println(resZ);


    //******************Diapositiva 14************************ */
/* 
    boolean X, Y, Z;
    X = true;
    Y = false;
    Z = true;
    boolean rA = (X && Y) || (X && Z); // true
    boolean rB = X || Y && Z; // true
    boolean rC = X || Y || X && !Z && !Y; // true
    boolean rD = (X || !Y)&& (!X || Z); // true
    boolean rE = !(X || Y) && Z; // false
    boolean rF = !X || !Y || Z && X && !Y; // true
    System.out.println(rA);
    System.out.println(rB);
    System.out.println(rC);
    System.out.println(rD);
    System.out.println(rE);
    System.out.println(rF); */

    /*******************Diapositiva 15*****************************************/
    
    boolean W, X, Y, Z;
    W = false;
    X = true;
    Y = true;
    Z = false;
    boolean rA = W || Y && X && W || Z ;
    boolean rB = !(W||!Y)&&X||Z;
    boolean rC = Y||!(Y||Z&&W);
    boolean rD = X && !Y&&!X|| !W&&Y;
    boolean rE = X&& Y&&W||Z||X;
    boolean rF = !X&&Y&&(!Z||!X);
    System.out.println(rA); // false
    System.out.println(rB); // true
    System.out.println(rC); // true
    System.out.println(rD); // true
    System.out.println(rE); // true
    System.out.println(rF); // false

    /*******************Diapositiva 16*****************************************/
    int i = 8, j = 5;
    float x = 0.005F, y = -0.01F;
    char c = 'c', d = 'd';

    boolean r1 = i<=j;
    boolean r2 = x>=0;
    boolean r3 = j!=6;
    boolean r4 = !(i<=j);
    boolean r5 = !(x>0);
    boolean r6 = ++x>0;
    boolean r7 = c>d || c>0;
    boolean r8 = 2*x+y == 0;
    boolean r9 = x+y >= 0;
    boolean r10 = - (i+j) != -i+j;
    boolean r11 = i>0&&j<5;
    boolean r12 = x>y&&i>0||j<5;
    boolean r13 = 2 * ((i / 5) + (4 * (j - 3)) % (i + j - 2)) >= 10;
    boolean r14 = c > d;
    boolean r15 = x < y--;
    boolean r16 = c == 99;
    boolean r17 = !(c==99);
    boolean r18 = -j == i - 13;
    boolean r19 = y--<1;
    boolean r20 = 5 * (i + j) > 'c';
     // boolean r21 = (2*x + (y==0)); // The operator + is undefined for the argument type(s) float, booleanJava(536871072) Es raro este error. Puede ser que sea porque y == 0 es float = 0, y float no puede ser 0 ?
    boolean r21 = x < ++y;
    boolean r22 = i<= j&& i>=c;
    boolean r23 = i > 0 || j < 5;
    boolean r24 = (3 * i - 2 * j) % (2 * d - c) > 3 * d;
    boolean r25 = (i - 3 * j) % (c + 2 * d) / (x - y) >= 0;
    System.out.println(r1); // false
    System.out.println(r2); // true
    System.out.println(r3); // true
    System.out.println(r4); // true
    System.out.println(r5); // false // bien
    System.out.println(r6); // true
    System.out.println(r7); // true
    System.out.println(r8); // false // bien
    System.out.println(r9); // true
    System.out.println(r10); // true
    System.out.println(r11); // false
    System.out.println(r12); // true
    System.out.println(r13); // true
    System.out.println(r14); // false
    System.out.println(r15); // false
    System.out.println(r16); // true
    System.out.println(r17); // false
    System.out.println(r18); // true
    System.out.println(r19); // true
    System.out.println(r20); // false
    System.out.println(r21); // false
    System.out.println(r22); // false
    System.out.println(r23); // true
    System.out.println(r24); // false
    System.out.println(r25); // false
  }
}