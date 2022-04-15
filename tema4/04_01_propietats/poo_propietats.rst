###########################
Anotacions sobre propietats
###########################

* Autor/a: Islam El Omrani Akhazzan		

* Data: 02/03/2022

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       public int vides = 7;         // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``XXX``.

Si reanomeno el fitxer anterior a ``UnNomQualsevol.java``, em trobo el
següent resultat a l'hora de compilar:

::

    $ javac UnNomQualsevol.java
    UnNomQualsevol.java:1: error: class GatRenat is public, should be declared in a file named GatRenat.java
	
	public class GatRenat {
       ^
	1 error


Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
   	Al gat Renat li queden 7 vides


Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 6 és la línia 4.

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 2.

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

::

	ZERO! -> Al gat Renat li queden 0 vides.  

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

	GatRenat.java:6: error: variable renat might not have been initialized
	
	System.out.println("Al gat Renat li queden " + renat.vides + " vides");
		                                           ^
	1 error


Penso que passa això perquè amb GatRenat renat només declarem la referència al gat i si no fem el new() no s'inicialitza la variable renat.

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè simplement es crea un apuntador a la zona de la memòria on s'inicialitzarà si s'escau la instància.

Crec que la  relació entre *referència* i *variable* és: que la referència és l'adreça de la zona de memòria on s'emmagatzemarà la variable.


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: new GatRenat()

* la variable és: renat

* la referència és: renat

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències que presenta la variable ``vides`` respecte les 
*variables globals* són:

1. Que està declarada dins de la classe fora del main

2. Que porta un public al davant, lo qual significa que la variable pot ser consultada i editada des de dins de la classe i des de fora. Si es private, només es pot editar des de dins de la classe.
