#############################
Anotacions sobre accés extern
#############################

* Autor/a: Islam El Omrani Akhazzan

* Data: 06/03/2022

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *accés extern* 
dins de la *programació orientada a objectes*.

Disposem ara de dos fitxers amb codi:

* ``GatRenat.java``

  ::

    01   public class GatRenat {
    02       public int vides = 7;         // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }



* ``UsaGatRenat.java``

  ::

    01      public class UsaGatRenat {
    02          public static void main(String[] args) {
    03              GatRenat renat = new GatRenat();
    04              System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    05          }
    06      }

Pregunta 1. On està el ``main()``
=================================

El punt d'entrada ``main()`` d'aquest programa es troba al fitxer UsaGatRenat.java.

Pregunta 2. Distingint dos ``main()``
=====================================

Ara tenim dos fitxers amb ``main()``. Java pot saber quin dels dos volem
executar gracies a que només va a executar el main del programa que li diguem que executi. Si fem java UsaGatRenat mai s'executarà el main de GatRenat.java

Pregunta 3. Definició de la classe
==================================

La classe del gat Renat està definida al fitxer GatRenat.java

Pregunta 4. Quants programes
============================

El nombre de programes que es podrien construir fent ús de la definició del gat Renat és infinit

Penso això perquè podem utilitzar una classe les vegades que vulguem.

Pregunta 5. Eliminant ``main()``
================================

Quan elimino el ``main()`` de ``GatRenat`` (per exemple, comentant-lo) em trobo que en intentar
tornar a compilar/executar ``UsaGatRenat``, em mostra lo mateix. Que el Gat Renat té 7 vides.

El que sí ha deixat de funcionar és GatRenat.java

Pregunta 6. Diferents directoris
================================

Després de moure el fitxer ``UsaGatRenat.java`` a una carpeta diferent d'on es
troba ``GatRenat.java``, m'he trobat que:

UsaGatRenat.java:3: error: cannot find symbol
                  GatRenat renat = new GatRenat();
                  ^
  symbol:   class GatRenat
  location: class UsaGatRenat
UsaGatRenat.java:3: error: cannot find symbol
                  GatRenat renat = new GatRenat();
                                       ^
  symbol:   class GatRenat
  location: class UsaGatRenat
2 errors

2 errors perquè obviament no troba la classe GatRenat, ja que està en un altre directori.




















