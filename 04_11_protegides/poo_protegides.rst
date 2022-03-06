##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: XXX

* Data: XXX

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que UsaGatRenat no compila:

UsaGatRenat.java:4: error: vides has private access in GatRenat
               System.out.println("El gat Renat té " + renat.vides + " vides");
                                                            ^
1 error


Penso que passa perquè la propietat vides de GatRenat és privada.

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que ara accedim a la propietat vides amb un getter de la pròpia classe GatRenat.

El resultat ara és que compila UsaGatRenat i ens dona:
El gat Renat té 7 vides


Penso que passa això perquè ara accedim a la propietat vides amb un getter de la pròpia classe GatRenat i com és de la pròpia classe sí que pot retornar les vides de GatRenat.

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer ús del setter de la classe GatRenat.

El codi de ``UsaGatRenat`` seria:

::

    public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(5); //Aquí està la clau de l'exercici
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides



La meva explicació de perquè això és així és perquè al ser privada la propietat només hi podem accedir a través de la pròpia classe utilitzant els seus mòduls per consultar o canviar el valor d'una propietat.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que es queda a 7.

El codi seria:

::

    public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(-12);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 7 vides


La meva explicació de perquè això és així és perquè el setter de la classe GatRenat només ens deixa assignar valors positius a vides del GatRenat.


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què sí que posa -12 com a nombre de vides del GatRenat.

Comparant-lo amb el que passava a la pregunta 1, veiem que amb renat.vides a la mateixa classe sí que canvia el valor, des de fora no ho pot fer si és privada.

La meva explicació és perquè una propietat privada es pot canviar des de dins d'una classe però no des de fora. Des de fora només es pot amb setters

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és no perquè sempre que volguem posar un nou valor des de fora, hem de cridar a setVides i auqest mòdul no posa cap valor negatiu a vides.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és la possibilitat de accedir a les propietats des de fora o no.

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls getVides i setVides.

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria que no podríem canviar el valor, només consultar-lo.

En canvi, si només en tingués *setter* el que passaria és que només podríem canviar el valor, mai consultar-lo.

Finalment, si no en tingués cap dels dos, ens trobaríem que la propietat privada des de fora és inútil.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret no porten el static, que significa que son mètodes disponibles només per la classe. Quan un mòdul porta static és que s'hi pot accedir al mòdul sense haver de crear una instància de la classe.
