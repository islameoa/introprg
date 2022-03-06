#####################################
Anotacions sobre múltiples instàncies
#####################################

* Autor/a: XXX

* Data: XXX

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *múltiples
instàncies* dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01    public class GatRenat {
    02        public int vides = 7;   // vides disponibles del gat Renat
    03
    04        public static void main(String[] args) {
    05            GatRenat renatI;
    06            renatI = new GatRenat();               // crea un primer gat Renat
    07            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    08
    09            GatRenat renatII = new GatRenat();     // crea un segon gat Renat!
    10            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    11
    12            renatI.vides++;
    13            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    14            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    15
    16            renatII = renatI; // atenció: la instància de Renat II es perd!
    17            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    18            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    19
    20            renatI.vides++;
    21            System.out.println("El gat Renat I té  " + renatI.vides + " vides");
    22            System.out.println("El gat Renat II té " + renatII.vides + " vides");
    23        }
    24    }

Pregunta 1. Sortida
===================

La sortida en executar el programa anterior és:

::

    $ java GatRenat
    El gat Renat I té  7 vides
	El gat Renat II té 7 vides
	El gat Renat I té  8 vides
	El gat Renat II té 7 vides
	El gat Renat I té  8 vides
	El gat Renat II té 8 vides
	El gat Renat I té  9 vides
	El gat Renat II té 9 vides


Pregunta 2. Memòria
===================

La memòria que ocupa, com a mínim, una instància de ``GatRenat`` és l'equivalent a un enter (4 bytes).

Baso els meus càlculs en que l'unica propietat que té la classe GatRenat és un int.


Pregunta 3. Fins la línia 5
===========================

El nombre d'instànces de ``GatRenat`` tot just executat el codi fins la línia 5 (inclosa) és zero.

Pregunta 4. Fins la línia 6
===========================

El nombre d'instànces de ``GatRenat`` tot just executat el codi fins la línia 6 (inclosa) és una.

Pregunta 5. Fins la línia 9
===========================

El nombre d'instànces de ``GatRenat`` tot just executat el codi fins la línia 9 (inclosa) és dos.

Pregunta 6. Vides iguals a 7 i 10
=================================

Les línies 7 i 10 mostren les mateixes vides pels gats Renat I i Renat II,
perquè els dos gats son instàncies de la mateixa classe, és a dir tenen el nombre de vides de qualsevol GatRenat instanciat.

Pregunta 7. Vides diferents a 13 i 14
=====================================

Les línies 13 i 14 mostren diferent nombre de vides pels gats Renat I i
Renat II, perquè a la línia 12 només hem incrementat les vides de RenatI.

Pregunta 8. El comentari de la línia 16
=======================================

Penso que el comentari de la línia 16 vol dir que ara RenatII serà equivalent a RenatI i per tant, RenatII "deixarà d'existir".

Pregunta 9. Vides iguals a 17 i 18
==================================

Les línies 17 i 18 mostren les mateixes vides pels gats Renat I i Renat
II, perquè al igualar RenatII amb RenatI, RenatII agafa les propietats de RenatI.

Pregunta 10. Vides iguals a 21 i 22
===================================

Les línies 21 i 22 mostren les mateixes vides pels gats Renat I i Renat II
malgrat la instrucció de la línia 20, perquè, com he esmentat abans, ara RenatII té com a propietat les vides de RenatI.

Pregunta 11. Nombre d'instàncies
================================

El nombre d'instàncies hi ha quan s'executa la línia 20 és una.

La raó és que al fer l'igualació d'instàncies la primera desapareix i les seves propietats s'igualen a les de la segona instància que serà l'unica disponible.

